// Generated from /home/bernardo/Documents/FEUP-COMP/src/Autotuner.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutotunerParser}.
 */
public interface AutotunerListener extends ParseTreeListener {
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
}