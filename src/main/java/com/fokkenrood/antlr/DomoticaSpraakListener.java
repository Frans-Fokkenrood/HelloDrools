// Generated from src\main\java\com\fokkenrood\antlr\DomoticaSpraak.g4 by ANTLR 4.6
package com.fokkenrood.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DomoticaSpraakParser}.
 */
public interface DomoticaSpraakListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DomoticaSpraakParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(DomoticaSpraakParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomoticaSpraakParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(DomoticaSpraakParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomoticaSpraakParser#regel}.
	 * @param ctx the parse tree
	 */
	void enterRegel(DomoticaSpraakParser.RegelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomoticaSpraakParser#regel}.
	 * @param ctx the parse tree
	 */
	void exitRegel(DomoticaSpraakParser.RegelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomoticaSpraakParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(DomoticaSpraakParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomoticaSpraakParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(DomoticaSpraakParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomoticaSpraakParser#voorwaarde}.
	 * @param ctx the parse tree
	 */
	void enterVoorwaarde(DomoticaSpraakParser.VoorwaardeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomoticaSpraakParser#voorwaarde}.
	 * @param ctx the parse tree
	 */
	void exitVoorwaarde(DomoticaSpraakParser.VoorwaardeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomoticaSpraakParser#testcase}.
	 * @param ctx the parse tree
	 */
	void enterTestcase(DomoticaSpraakParser.TestcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomoticaSpraakParser#testcase}.
	 * @param ctx the parse tree
	 */
	void exitTestcase(DomoticaSpraakParser.TestcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomoticaSpraakParser#testgeval}.
	 * @param ctx the parse tree
	 */
	void enterTestgeval(DomoticaSpraakParser.TestgevalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomoticaSpraakParser#testgeval}.
	 * @param ctx the parse tree
	 */
	void exitTestgeval(DomoticaSpraakParser.TestgevalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomoticaSpraakParser#invoer}.
	 * @param ctx the parse tree
	 */
	void enterInvoer(DomoticaSpraakParser.InvoerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomoticaSpraakParser#invoer}.
	 * @param ctx the parse tree
	 */
	void exitInvoer(DomoticaSpraakParser.InvoerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomoticaSpraakParser#toekennen}.
	 * @param ctx the parse tree
	 */
	void enterToekennen(DomoticaSpraakParser.ToekennenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomoticaSpraakParser#toekennen}.
	 * @param ctx the parse tree
	 */
	void exitToekennen(DomoticaSpraakParser.ToekennenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomoticaSpraakParser#waarde}.
	 * @param ctx the parse tree
	 */
	void enterWaarde(DomoticaSpraakParser.WaardeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomoticaSpraakParser#waarde}.
	 * @param ctx the parse tree
	 */
	void exitWaarde(DomoticaSpraakParser.WaardeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomoticaSpraakParser#vergelijking}.
	 * @param ctx the parse tree
	 */
	void enterVergelijking(DomoticaSpraakParser.VergelijkingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomoticaSpraakParser#vergelijking}.
	 * @param ctx the parse tree
	 */
	void exitVergelijking(DomoticaSpraakParser.VergelijkingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomoticaSpraakParser#feit}.
	 * @param ctx the parse tree
	 */
	void enterFeit(DomoticaSpraakParser.FeitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomoticaSpraakParser#feit}.
	 * @param ctx the parse tree
	 */
	void exitFeit(DomoticaSpraakParser.FeitContext ctx);
}