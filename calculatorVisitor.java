// Generated from calculator.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(@NotNull calculatorParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull calculatorParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull calculatorParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull calculatorParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull calculatorParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Una}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(@NotNull calculatorParser.UnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull calculatorParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull calculatorParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull calculatorParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull calculatorParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pair}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(@NotNull calculatorParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull calculatorParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull calculatorParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl(@NotNull calculatorParser.Param_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmp(@NotNull calculatorParser.EmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(@NotNull calculatorParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull calculatorParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(@NotNull calculatorParser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull calculatorParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(@NotNull calculatorParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull calculatorParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull calculatorParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull calculatorParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull calculatorParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull calculatorParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull calculatorParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(@NotNull calculatorParser.FuncDeclContext ctx);
}