// Generated from /home/bernardo/Documents/FEUP-COMP/src/AutotunerParser.g4 by ANTLR 4.6
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AutotunerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AutotunerParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AutotunerParser#pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma(AutotunerParser.PragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutotunerParser#tuner_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuner_id(AutotunerParser.Tuner_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutotunerParser#explore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplore(AutotunerParser.ExploreContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutotunerParser#max_abs_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax_abs_error(AutotunerParser.Max_abs_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutotunerParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(AutotunerParser.StartContext ctx);
}