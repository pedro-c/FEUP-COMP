// Generated from /home/pedroc/Documents/FEUP-COMP/src/AutotunerParser.g4 by ANTLR 4.6
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
	 * Enter a parse tree produced by {@link AutotunerParser#pragma_tuner}.
	 * @param ctx the parse tree
	 */
	void enterPragma_tuner(AutotunerParser.Pragma_tunerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#pragma_tuner}.
	 * @param ctx the parse tree
	 */
	void exitPragma_tuner(AutotunerParser.Pragma_tunerContext ctx);
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
	 * Enter a parse tree produced by {@link AutotunerParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AutotunerParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AutotunerParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutotunerParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(AutotunerParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(AutotunerParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutotunerParser#universal_char}.
	 * @param ctx the parse tree
	 */
	void enterUniversal_char(AutotunerParser.Universal_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#universal_char}.
	 * @param ctx the parse tree
	 */
	void exitUniversal_char(AutotunerParser.Universal_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutotunerParser#hex_quad}.
	 * @param ctx the parse tree
	 */
	void enterHex_quad(AutotunerParser.Hex_quadContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutotunerParser#hex_quad}.
	 * @param ctx the parse tree
	 */
	void exitHex_quad(AutotunerParser.Hex_quadContext ctx);
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