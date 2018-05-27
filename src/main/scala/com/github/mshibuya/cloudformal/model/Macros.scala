package com.github.mshibuya.cloudformal.model

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

object Macros {

  def impl[A](c: Context)(stack: c.Expr[SubStack], tpe: c.Type, nameInSubstack: String): c.Expr[Seq[A]] = {
    import c.universe._

    val subStackType = weakTypeOf[SubStack]
    val members = stack.actualType.members.toList.filter {
      m => !m.isMethod &&
        m.toString.startsWith("value")
    }.collect {
        case m if m.typeSignature <:< tpe => q"Seq(${m.name.toTermName})"
        case m if m.typeSignature <:< subStackType => q"${m.name.toTermName}.${TermName(nameInSubstack)}"
    }.reverse
    c.Expr[Seq[A]](q"Seq(..$members).flatten")
  }


  def parametersIn_impl(c: Context)(stack: c.Expr[SubStack]): c.Expr[Seq[Parameter[_, _]]] = {
    impl[Parameter[_, _]](c)(stack, c.universe.weakTypeOf[Parameter[_, _]], "parameters")
  }

  def parametersIn_debug(c: Context)(stack: c.Expr[SubStack]): c.Expr[Seq[Parameter[_, _]]] = {
    val expr = parametersIn_impl(c)(stack)
    println(expr.tree)
    expr
  }

  def parametersIn(stack: SubStack): Seq[Parameter[_, _]] = macro parametersIn_impl
  def parametersInDebug(stack: SubStack): Seq[Parameter[_, _]] = macro parametersIn_debug


  def mappingsIn_impl(c: Context)(stack: c.Expr[SubStack]): c.Expr[Seq[Mapping]] = {
    impl[Mapping](c)(stack, c.universe.weakTypeOf[Mapping], "mappings")
  }

  def mappingsIn_debug(c: Context)(stack: c.Expr[SubStack]): c.Expr[Seq[Mapping]] = {
    val expr = mappingsIn_impl(c)(stack)
    println(expr.tree)
    expr
  }

  def mappingsIn(stack: SubStack): Seq[Mapping] = macro mappingsIn_impl
  def mappingsInDebug(stack: SubStack): Seq[Mapping] = macro mappingsIn_debug


  def resourcesIn_impl(c: Context)(stack: c.Expr[SubStack]): c.Expr[Seq[Resource[_]]] = {
    impl[Resource[_]](c)(stack, c.universe.weakTypeOf[Resource[_]], "resources")
  }

  def resourcesIn_debug(c: Context)(stack: c.Expr[SubStack]): c.Expr[Seq[Resource[_]]] = {
    val expr = resourcesIn_impl(c)(stack)
    println(expr.tree)
    expr
  }

  def resourcesIn(stack: SubStack): Seq[Resource[_]] = macro resourcesIn_impl
  def resourcesInDebug(stack: SubStack): Seq[Resource[_]] = macro resourcesIn_debug


  def outputsIn_impl(c: Context)(stack: c.Expr[SubStack]): c.Expr[Seq[Output[_]]] = {
    impl[Output[_]](c)(stack, c.universe.weakTypeOf[Output[_]], "outputs")
  }

  def outputsIn_debug(c: Context)(stack: c.Expr[SubStack]): c.Expr[Seq[Output[_]]] = {
    val expr = outputsIn_impl(c)(stack)
    println(expr.tree)
    expr
  }

  def outputsIn(stack: SubStack): Seq[Output[_]] = macro outputsIn_impl
  def outputsInDebug(stack: SubStack): Seq[Output[_]] = macro outputsIn_debug
}
