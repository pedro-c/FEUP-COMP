// Generated from /Users/Francisca/Desktop/MIEIC/3Ano/2semestre/SDIS/testeANTLR/src/AutotunerParser.g4 by ANTLR 4.6
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
	 * Enter a parse tree produced by {@link AutotunerParser#startpoint}.
	 * @param ctx the parse tree
	 */
	void enterStartpoint(AutotunerParser.StartpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#startpoint}.
	 * @param ctx the parse tree
	 */
	void exitStartpoint(AutotunerParser.StartpointContext ctx);
}