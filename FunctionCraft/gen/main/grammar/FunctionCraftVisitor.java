// Generated from C:/Users/heypo/Desktop/Uni/Term 8/COMPILER/Proj/CA1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#blabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlabla(FunctionCraftParser.BlablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(FunctionCraftParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(FunctionCraftParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(FunctionCraftParser.OptionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(FunctionCraftParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#logic_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_exp(FunctionCraftParser.Logic_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(FunctionCraftParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#condi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondi(FunctionCraftParser.CondiContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(FunctionCraftParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#func_ptr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_ptr(FunctionCraftParser.Func_ptrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(FunctionCraftParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#body_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_func(FunctionCraftParser.Body_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ret_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet_exp(FunctionCraftParser.Ret_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(FunctionCraftParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#append}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend(FunctionCraftParser.AppendContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ifcondi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfcondi(FunctionCraftParser.IfcondiContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loopdo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopdo(FunctionCraftParser.LoopdoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#bodyloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyloop(FunctionCraftParser.BodyloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#forin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForin(FunctionCraftParser.ForinContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#built_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt_in(FunctionCraftParser.Built_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#for_condi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_condi(FunctionCraftParser.For_condiContext ctx);
}