package com.github.mshibuya.cloudformal.model

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

object autoMembers {

  def apply_impl[A: c.WeakTypeTag, B: c.WeakTypeTag](c: Context)(excludes: c.Expr[B]*): c.Expr[Seq[B]] = {
    import c.universe._

    val tpe = weakTypeOf[A]
    val excludedSymbols = excludes.toList.map(_.tree.symbol)
    val members = tpe.members.toList.filter {
      m => !m.isMethod &&
        m.toString.startsWith("value") &&
        m.typeSignature <:< weakTypeOf[B]
    }.reverse.map(_.name.decodedName)
    c.Expr[Seq[B]](q"Seq(..$members)")
  }

  def debug_impl[A: c.WeakTypeTag, B: c.WeakTypeTag](c: Context)(excludes: c.Expr[B]*): c.Expr[Seq[B]] = {
    val expr = apply_impl[A, B](c)(excludes: _*)
    println(expr.tree)
    expr
  }

  def apply[A, B](excludes: B*): Seq[B] = macro apply_impl[A, B]

  def debug[A, B](excludes: B*): Seq[B] = macro debug_impl[A, B]
}
