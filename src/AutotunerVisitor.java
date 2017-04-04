// Generated from /home/bernardo/Documents/FEUP-COMP/src/Autotuner.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AutotunerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AutotunerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AutotunerParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(AutotunerParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutotunerParser#pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma(AutotunerParser.PragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutotunerParser#tunerId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTunerId(AutotunerParser.TunerIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutotunerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AutotunerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutotunerParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(AutotunerParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutotunerParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(AutotunerParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutotunerParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(AutotunerParser.CommentContext ctx);
}