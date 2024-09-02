// Generated from C:/Users/heypo/Desktop/Uni/Term 8/COMPILER/Proj/CA1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#blabla}.
	 * @param ctx the parse tree
	 */
	void enterBlabla(FunctionCraftParser.BlablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#blabla}.
	 * @param ctx the parse tree
	 */
	void exitBlabla(FunctionCraftParser.BlablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(FunctionCraftParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(FunctionCraftParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FunctionCraftParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(FunctionCraftParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(FunctionCraftParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#optional}.
	 * @param ctx the parse tree
	 */
	void enterOptional(FunctionCraftParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#optional}.
	 * @param ctx the parse tree
	 */
	void exitOptional(FunctionCraftParser.OptionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(FunctionCraftParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(FunctionCraftParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#logic_exp}.
	 * @param ctx the parse tree
	 */
	void enterLogic_exp(FunctionCraftParser.Logic_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#logic_exp}.
	 * @param ctx the parse tree
	 */
	void exitLogic_exp(FunctionCraftParser.Logic_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(FunctionCraftParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(FunctionCraftParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#condi}.
	 * @param ctx the parse tree
	 */
	void enterCondi(FunctionCraftParser.CondiContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#condi}.
	 * @param ctx the parse tree
	 */
	void exitCondi(FunctionCraftParser.CondiContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(FunctionCraftParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(FunctionCraftParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#func_ptr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_ptr(FunctionCraftParser.Func_ptrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#func_ptr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_ptr(FunctionCraftParser.Func_ptrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(FunctionCraftParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(FunctionCraftParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#body_func}.
	 * @param ctx the parse tree
	 */
	void enterBody_func(FunctionCraftParser.Body_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#body_func}.
	 * @param ctx the parse tree
	 */
	void exitBody_func(FunctionCraftParser.Body_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ret_exp}.
	 * @param ctx the parse tree
	 */
	void enterRet_exp(FunctionCraftParser.Ret_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ret_exp}.
	 * @param ctx the parse tree
	 */
	void exitRet_exp(FunctionCraftParser.Ret_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(FunctionCraftParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(FunctionCraftParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#append}.
	 * @param ctx the parse tree
	 */
	void enterAppend(FunctionCraftParser.AppendContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#append}.
	 * @param ctx the parse tree
	 */
	void exitAppend(FunctionCraftParser.AppendContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ifcondi}.
	 * @param ctx the parse tree
	 */
	void enterIfcondi(FunctionCraftParser.IfcondiContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ifcondi}.
	 * @param ctx the parse tree
	 */
	void exitIfcondi(FunctionCraftParser.IfcondiContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loopdo}.
	 * @param ctx the parse tree
	 */
	void enterLoopdo(FunctionCraftParser.LoopdoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loopdo}.
	 * @param ctx the parse tree
	 */
	void exitLoopdo(FunctionCraftParser.LoopdoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#bodyloop}.
	 * @param ctx the parse tree
	 */
	void enterBodyloop(FunctionCraftParser.BodyloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#bodyloop}.
	 * @param ctx the parse tree
	 */
	void exitBodyloop(FunctionCraftParser.BodyloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#forin}.
	 * @param ctx the parse tree
	 */
	void enterForin(FunctionCraftParser.ForinContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#forin}.
	 * @param ctx the parse tree
	 */
	void exitForin(FunctionCraftParser.ForinContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#built_in}.
	 * @param ctx the parse tree
	 */
	void enterBuilt_in(FunctionCraftParser.Built_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#built_in}.
	 * @param ctx the parse tree
	 */
	void exitBuilt_in(FunctionCraftParser.Built_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#for_condi}.
	 * @param ctx the parse tree
	 */
	void enterFor_condi(FunctionCraftParser.For_condiContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#for_condi}.
	 * @param ctx the parse tree
	 */
	void exitFor_condi(FunctionCraftParser.For_condiContext ctx);
}