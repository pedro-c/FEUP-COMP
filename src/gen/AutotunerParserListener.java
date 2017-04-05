// Generated from /home/bernardo/Documents/FEUP-COMP/src/AutotunerParser.g4 by ANTLR 4.6
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutotunerParser}.
 */
public interface AutotunerParserListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link AutotunerParser#tuner_id}.
	 * @param ctx the parse tree
	 */
	void enterTuner_id(AutotunerParser.Tuner_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#tuner_id}.
	 * @param ctx the parse tree
	 */
	void exitTuner_id(AutotunerParser.Tuner_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutotunerParser#explore}.
	 * @param ctx the parse tree
	 */
	void enterExplore(AutotunerParser.ExploreContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#explore}.
	 * @param ctx the parse tree
	 */
	void exitExplore(AutotunerParser.ExploreContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutotunerParser#max_abs_error}.
	 * @param ctx the parse tree
	 */
	void enterMax_abs_error(AutotunerParser.Max_abs_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#max_abs_error}.
	 * @param ctx the parse tree
	 */
	void exitMax_abs_error(AutotunerParser.Max_abs_errorContext ctx);
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
}