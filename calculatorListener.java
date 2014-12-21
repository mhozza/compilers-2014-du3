// Generated from calculator.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRet(@NotNull calculatorParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRet(@NotNull calculatorParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull calculatorParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull calculatorParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull calculatorParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull calculatorParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull calculatorParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull calculatorParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull calculatorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull calculatorParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Una}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUna(@NotNull calculatorParser.UnaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Una}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUna(@NotNull calculatorParser.UnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull calculatorParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull calculatorParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull calculatorParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull calculatorParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull calculatorParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull calculatorParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull calculatorParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull calculatorParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pair}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPair(@NotNull calculatorParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pair}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPair(@NotNull calculatorParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull calculatorParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull calculatorParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull calculatorParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull calculatorParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(@NotNull calculatorParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(@NotNull calculatorParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmp(@NotNull calculatorParser.EmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmp(@NotNull calculatorParser.EmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#param_call}.
	 * @param ctx the parse tree
	 */
	void enterParam_call(@NotNull calculatorParser.Param_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#param_call}.
	 * @param ctx the parse tree
	 */
	void exitParam_call(@NotNull calculatorParser.Param_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull calculatorParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull calculatorParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(@NotNull calculatorParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(@NotNull calculatorParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull calculatorParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull calculatorParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(@NotNull calculatorParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(@NotNull calculatorParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull calculatorParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull calculatorParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull calculatorParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull calculatorParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull calculatorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull calculatorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull calculatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull calculatorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull calculatorParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull calculatorParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull calculatorParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull calculatorParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(@NotNull calculatorParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link calculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(@NotNull calculatorParser.FuncDeclContext ctx);
}