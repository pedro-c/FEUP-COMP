// Generated from /home/bernardo/Documents/FEUP-COMP/src/Autotuner.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutotunerParser}.
 */
public interface AutotunerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AutotunerParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AutotunerParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AutotunerParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutotunerParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(AutotunerParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(AutotunerParser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutotunerParser#tunerId}.
	 * @param ctx the parse tree
	 */
	void enterTunerId(AutotunerParser.TunerIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#tunerId}.
	 * @param ctx the parse tree
	 */
	void exitTunerId(AutotunerParser.TunerIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutotunerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AutotunerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AutotunerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutotunerParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(AutotunerParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(AutotunerParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutotunerParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(AutotunerParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(AutotunerParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutotunerParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(AutotunerParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(AutotunerParser.CommentContext ctx);
}