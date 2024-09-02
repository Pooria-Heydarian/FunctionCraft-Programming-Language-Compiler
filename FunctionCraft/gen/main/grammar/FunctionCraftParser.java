// Generated from C:/Users/heypo/Desktop/Uni/Term 8/COMPILER/Proj/CA1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_VAL=1, FLOAT=2, LPAR=3, RPAR=4, LBRAK=5, RBRAK=6, COMMA=7, DOT=8, 
		DDOT=9, COLON=10, SEMICOLON=11, PLUS=12, MINUS=13, MULTI=14, DIV=15, INC=16, 
		DEC=17, REMAIN=18, GEQ=19, LEQ=20, GTR=21, LES=22, EQL=23, NEQ=24, AND=25, 
		OR=26, NOT=27, APPEND=28, ASSIGN=29, PASSIGN=30, MASSIGN=31, OASSIGN=32, 
		DASSIGN=33, RASSIGN=34, CASE=35, PATTERN=36, MATCH=37, DEF=38, END=39, 
		RETURN=40, METHOD=41, MAP=42, LEN=43, CHOP=44, CHOMP=45, PUSH=46, PUTS=47, 
		MAIN=48, LBRACE=49, RBRACE=50, LOOP=51, DO=52, FOR=53, IN=54, NEXT=55, 
		BREAK=56, IF=57, ELSE=58, ELSEIF=59, TURE=60, FALSE=61, IDENTIFIER=62, 
		STRING=63, NEWLINE=64, INLINECOMMENT=65, MULLINECOMMENT=66, SPACE=67;
	public static final int
		RULE_program = 0, RULE_blabla = 1, RULE_function = 2, RULE_lambda = 3, 
		RULE_list = 4, RULE_pattern = 5, RULE_main = 6, RULE_params = 7, RULE_optional = 8, 
		RULE_exp = 9, RULE_logic_exp = 10, RULE_compare = 11, RULE_function_call = 12, 
		RULE_condi = 13, RULE_const = 14, RULE_func_ptr = 15, RULE_comp = 16, 
		RULE_body_func = 17, RULE_ret_exp = 18, RULE_assign = 19, RULE_assignment = 20, 
		RULE_append = 21, RULE_ifcondi = 22, RULE_loop = 23, RULE_loopdo = 24, 
		RULE_bodyloop = 25, RULE_forin = 26, RULE_range = 27, RULE_built_in = 28, 
		RULE_for_condi = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "blabla", "function", "lambda", "list", "pattern", "main", 
			"params", "optional", "exp", "logic_exp", "compare", "function_call", 
			"condi", "const", "func_ptr", "comp", "body_func", "ret_exp", "assign", 
			"assignment", "append", "ifcondi", "loop", "loopdo", "bodyloop", "forin", 
			"range", "built_in", "for_condi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'['", "']'", "','", "'.'", "'..'", "':'", 
			"';'", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'", "'%'", "'>='", "'<='", 
			"'>'", "'<'", "'=='", "'!='", "'&&'", "'||'", "'!'", "'<<'", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'    |'", "'pattern'", "'match'", "'def'", 
			"'end'", "'return'", "'method'", "'->'", "'len'", "'chop'", "'chomp'", 
			"'push'", "'puts'", "'main'", "'{'", "'}'", "'loop'", "'do'", "'for'", 
			"'in'", "'next'", "'break'", "'if'", "'else'", "'elseif'", "'true'", 
			"'false'", null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_VAL", "FLOAT", "LPAR", "RPAR", "LBRAK", "RBRAK", "COMMA", 
			"DOT", "DDOT", "COLON", "SEMICOLON", "PLUS", "MINUS", "MULTI", "DIV", 
			"INC", "DEC", "REMAIN", "GEQ", "LEQ", "GTR", "LES", "EQL", "NEQ", "AND", 
			"OR", "NOT", "APPEND", "ASSIGN", "PASSIGN", "MASSIGN", "OASSIGN", "DASSIGN", 
			"RASSIGN", "CASE", "PATTERN", "MATCH", "DEF", "END", "RETURN", "METHOD", 
			"MAP", "LEN", "CHOP", "CHOMP", "PUSH", "PUTS", "MAIN", "LBRACE", "RBRACE", 
			"LOOP", "DO", "FOR", "IN", "NEXT", "BREAK", "IF", "ELSE", "ELSEIF", "TURE", 
			"FALSE", "IDENTIFIER", "STRING", "NEWLINE", "INLINECOMMENT", "MULLINECOMMENT", 
			"SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public BlablaContext blabla() {
			return getRuleContext(BlablaContext.class,0);
		}
		public List<TerminalNode> INLINECOMMENT() { return getTokens(FunctionCraftParser.INLINECOMMENT); }
		public TerminalNode INLINECOMMENT(int i) {
			return getToken(FunctionCraftParser.INLINECOMMENT, i);
		}
		public List<TerminalNode> MULLINECOMMENT() { return getTokens(FunctionCraftParser.MULLINECOMMENT); }
		public TerminalNode MULLINECOMMENT(int i) {
			return getToken(FunctionCraftParser.MULLINECOMMENT, i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionCraftParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionCraftParser.NEWLINE, i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(65);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INLINECOMMENT:
						{
						setState(60);
						match(INLINECOMMENT);
						}
						break;
					case MULLINECOMMENT:
						{
						setState(61);
						match(MULLINECOMMENT);
						}
						break;
					case DEF:
						{
						setState(62);
						function();
						}
						break;
					case NEWLINE:
						{
						setState(63);
						match(NEWLINE);
						}
						break;
					case PATTERN:
						{
						setState(64);
						pattern();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(70);
			main();
			setState(71);
			blabla();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlablaContext extends ParserRuleContext {
		public List<TerminalNode> MULLINECOMMENT() { return getTokens(FunctionCraftParser.MULLINECOMMENT); }
		public TerminalNode MULLINECOMMENT(int i) {
			return getToken(FunctionCraftParser.MULLINECOMMENT, i);
		}
		public List<TerminalNode> INLINECOMMENT() { return getTokens(FunctionCraftParser.INLINECOMMENT); }
		public TerminalNode INLINECOMMENT(int i) {
			return getToken(FunctionCraftParser.INLINECOMMENT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionCraftParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionCraftParser.NEWLINE, i);
		}
		public BlablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBlabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBlabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBlabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlablaContext blabla() throws RecognitionException {
		BlablaContext _localctx = new BlablaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				{
				setState(73);
				_la = _input.LA(1);
				if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Body_funcContext body_func() {
			return getRuleContext(Body_funcContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public OptionalContext optional() {
			return getRuleContext(OptionalContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(DEF);
			setState(80);
			((FunctionContext)_localctx).name = match(IDENTIFIER);
			System.out.println("FuncDec: " + (((FunctionContext)_localctx).name!=null?((FunctionContext)_localctx).name.getText():null));
			setState(82);
			match(LPAR);
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRAK:
				{
				setState(83);
				optional();
				}
				break;
			case IDENTIFIER:
				{
				setState(84);
				params();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(85);
					match(COMMA);
					setState(86);
					optional();
					}
				}

				}
				break;
			case RPAR:
				break;
			default:
				break;
			}
			setState(91);
			match(RPAR);
			setState(92);
			body_func();
			setState(93);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(FunctionCraftParser.MAP, 0); }
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public TerminalNode LBRACE() { return getToken(FunctionCraftParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public Ret_expContext ret_exp() {
			return getRuleContext(Ret_expContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode RBRACE() { return getToken(FunctionCraftParser.RBRACE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(MAP);
			System.out.println("Structure: LAMBDA");
			setState(97);
			match(LPAR);
			setState(98);
			params();
			setState(99);
			match(RPAR);
			setState(100);
			match(LBRACE);
			setState(101);
			match(RETURN);
			System.out.println("RETURN");
			setState(103);
			ret_exp();
			setState(104);
			match(SEMICOLON);
			setState(105);
			match(RBRACE);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(106);
				match(LPAR);
				setState(107);
				exp(0);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(108);
					match(COMMA);
					setState(109);
					exp(0);
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(RPAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRAK() { return getToken(FunctionCraftParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(FunctionCraftParser.RBRAK, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(LBRAK);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152648825723150294L) != 0)) {
				{
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(120);
					list();
					}
					break;
				case 2:
					{
					setState(121);
					exp(0);
					}
					break;
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(124);
					match(COMMA);
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(125);
						list();
						}
						break;
					case 2:
						{
						setState(126);
						exp(0);
						}
						break;
					}
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(136);
			match(RBRAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionCraftParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionCraftParser.NEWLINE, i);
		}
		public List<TerminalNode> CASE() { return getTokens(FunctionCraftParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(FunctionCraftParser.CASE, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<CondiContext> condi() {
			return getRuleContexts(CondiContext.class);
		}
		public CondiContext condi(int i) {
			return getRuleContext(CondiContext.class,i);
		}
		public List<Logic_expContext> logic_exp() {
			return getRuleContexts(Logic_expContext.class);
		}
		public Logic_expContext logic_exp(int i) {
			return getRuleContext(Logic_expContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(PATTERN);
			setState(139);
			((PatternContext)_localctx).name = match(IDENTIFIER);
			System.out.println("PatternDec: " + (((PatternContext)_localctx).name!=null?((PatternContext)_localctx).name.getText():null));
			setState(141);
			match(LPAR);
			setState(142);
			params();
			setState(143);
			match(RPAR);
			setState(155); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(144);
					match(NEWLINE);
					setState(145);
					match(CASE);
					setState(146);
					match(LPAR);
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(147);
						condi();
						}
						break;
					case 2:
						{
						setState(148);
						logic_exp();
						}
						break;
					}
					setState(151);
					match(RPAR);
					setState(152);
					match(ASSIGN);
					setState(153);
					exp(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(157); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				match(NEWLINE);
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(164);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Body_funcContext body_func() {
			return getRuleContext(Body_funcContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(DEF);
			setState(167);
			match(MAIN);
			System.out.println("MAIN");
			setState(169);
			match(LPAR);
			setState(170);
			match(RPAR);
			setState(171);
			body_func();
			setState(172);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(IDENTIFIER);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					match(COMMA);
					setState(176);
					match(IDENTIFIER);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionalContext extends ParserRuleContext {
		public TerminalNode LBRAK() { return getToken(FunctionCraftParser.LBRAK, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RBRAK() { return getToken(FunctionCraftParser.RBRAK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public OptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitOptional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitOptional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalContext optional() throws RecognitionException {
		OptionalContext _localctx = new OptionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_optional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(LBRAK);
			setState(183);
			match(IDENTIFIER);
			setState(184);
			match(ASSIGN);
			setState(185);
			exp(0);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(186);
				match(COMMA);
				setState(187);
				match(IDENTIFIER);
				setState(188);
				match(ASSIGN);
				setState(189);
				exp(0);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(RBRAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public Token name;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRAK() { return getTokens(FunctionCraftParser.LBRAK); }
		public TerminalNode LBRAK(int i) {
			return getToken(FunctionCraftParser.LBRAK, i);
		}
		public List<TerminalNode> RBRAK() { return getTokens(FunctionCraftParser.RBRAK); }
		public TerminalNode RBRAK(int i) {
			return getToken(FunctionCraftParser.RBRAK, i);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode STRING() { return getToken(FunctionCraftParser.STRING, 0); }
		public TerminalNode TURE() { return getToken(FunctionCraftParser.TURE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public TerminalNode FLOAT() { return getToken(FunctionCraftParser.FLOAT, 0); }
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MULTI() { return getToken(FunctionCraftParser.MULTI, 0); }
		public TerminalNode REMAIN() { return getToken(FunctionCraftParser.REMAIN, 0); }
		public TerminalNode INC() { return getToken(FunctionCraftParser.INC, 0); }
		public TerminalNode DEC() { return getToken(FunctionCraftParser.DEC, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(198);
				((ExpContext)_localctx).name = match(MINUS);
				System.out.println("Operator: " + (((ExpContext)_localctx).name!=null?((ExpContext)_localctx).name.getText():null));
				setState(200);
				exp(12);
				}
				break;
			case 2:
				{
				setState(201);
				match(IDENTIFIER);
				setState(206); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(202);
						match(LBRAK);
						setState(203);
						exp(0);
						setState(204);
						match(RBRAK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(208); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				{
				setState(210);
				match(LPAR);
				setState(211);
				exp(0);
				setState(212);
				match(RPAR);
				}
				break;
			case 4:
				{
				setState(214);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(215);
				match(TURE);
				}
				break;
			case 6:
				{
				setState(216);
				match(FALSE);
				setState(217);
				match(FLOAT);
				}
				break;
			case 7:
				{
				setState(218);
				match(INT_VAL);
				}
				break;
			case 8:
				{
				setState(219);
				function_call();
				}
				break;
			case 9:
				{
				setState(220);
				list();
				}
				break;
			case 10:
				{
				setState(221);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(224);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(225);
						((ExpContext)_localctx).name = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 323584L) != 0)) ) {
							((ExpContext)_localctx).name = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						exp(14);
						System.out.println("Operator: " + (((ExpContext)_localctx).name!=null?((ExpContext)_localctx).name.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(229);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(230);
						((ExpContext)_localctx).name = match(INC);
						System.out.println("Operator: " + (((ExpContext)_localctx).name!=null?((ExpContext)_localctx).name.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(232);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(233);
						((ExpContext)_localctx).name = match(DEC);
						System.out.println("Operator: " + (((ExpContext)_localctx).name!=null?((ExpContext)_localctx).name.getText():null));
						}
						break;
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logic_expContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public Logic_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLogic_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLogic_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLogic_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_expContext logic_exp() throws RecognitionException {
		Logic_expContext _localctx = new Logic_expContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logic_exp);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				exp(0);
				setState(241);
				compare();
				setState(242);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				exp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ParserRuleContext {
		public Token name;
		public TerminalNode EQL() { return getToken(FunctionCraftParser.EQL, 0); }
		public TerminalNode NEQ() { return getToken(FunctionCraftParser.NEQ, 0); }
		public TerminalNode GEQ() { return getToken(FunctionCraftParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(FunctionCraftParser.LEQ, 0); }
		public TerminalNode LES() { return getToken(FunctionCraftParser.LES, 0); }
		public TerminalNode GTR() { return getToken(FunctionCraftParser.GTR, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compare);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQL:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				((CompareContext)_localctx).name = match(EQL);
				System.out.println("Operator: " + (((CompareContext)_localctx).name!=null?((CompareContext)_localctx).name.getText():null));
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				((CompareContext)_localctx).name = match(NEQ);
				System.out.println("Operator: " + (((CompareContext)_localctx).name!=null?((CompareContext)_localctx).name.getText():null));
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				((CompareContext)_localctx).name = match(GEQ);
				System.out.println("Operator: " + (((CompareContext)_localctx).name!=null?((CompareContext)_localctx).name.getText():null));
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				((CompareContext)_localctx).name = match(LEQ);
				System.out.println("Operator: " + (((CompareContext)_localctx).name!=null?((CompareContext)_localctx).name.getText():null));
				}
				break;
			case LES:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				((CompareContext)_localctx).name = match(LES);
				System.out.println("Operator: " + (((CompareContext)_localctx).name!=null?((CompareContext)_localctx).name.getText():null));
				}
				break;
			case GTR:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				((CompareContext)_localctx).name = match(GTR);
				System.out.println("Operator: " + (((CompareContext)_localctx).name!=null?((CompareContext)_localctx).name.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public Built_inContext built_in() {
			return getRuleContext(Built_inContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<Ret_expContext> ret_exp() {
			return getRuleContexts(Ret_expContext.class);
		}
		public Ret_expContext ret_exp(int i) {
			return getRuleContext(Ret_expContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				built_in();
				setState(262);
				match(LPAR);
				{
				setState(263);
				ret_exp();
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(264);
					match(COMMA);
					setState(265);
					ret_exp();
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(271);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(IDENTIFIER);
				System.out.println("FunctionCall");
				setState(275);
				match(LPAR);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152644427542421462L) != 0)) {
					{
					setState(276);
					ret_exp();
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(277);
						match(COMMA);
						setState(278);
						ret_exp();
						}
						}
						setState(283);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(286);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(IDENTIFIER);
				setState(288);
				match(DOT);
				setState(289);
				match(MATCH);
				System.out.println("Bulit-In: MATCH");
				setState(291);
				match(LPAR);
				{
				setState(292);
				ret_exp();
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(293);
					match(COMMA);
					setState(294);
					ret_exp();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(300);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondiContext extends ParserRuleContext {
		public Token name;
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public CondiContext condi() {
			return getRuleContext(CondiContext.class,0);
		}
		public List<Logic_expContext> logic_exp() {
			return getRuleContexts(Logic_expContext.class);
		}
		public Logic_expContext logic_exp(int i) {
			return getRuleContext(Logic_expContext.class,i);
		}
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public TerminalNode TURE() { return getToken(FunctionCraftParser.TURE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public CondiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondiContext condi() throws RecognitionException {
		CondiContext _localctx = new CondiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condi);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(LPAR);
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					{
					setState(305);
					logic_exp();
					}
					}
					break;
				case 2:
					{
					setState(306);
					condi();
					}
					break;
				}
				setState(309);
				match(RPAR);
				setState(310);
				comp();
				setState(311);
				match(LPAR);
				{
				setState(312);
				logic_exp();
				}
				setState(313);
				match(RPAR);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				((CondiContext)_localctx).name = match(NOT);
				System.out.println("Operator: " + (((CondiContext)_localctx).name!=null?((CondiContext)_localctx).name.getText():null));
				setState(317);
				match(LPAR);
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(318);
					condi();
					}
					break;
				case 2:
					{
					setState(319);
					logic_exp();
					}
					break;
				}
				setState(322);
				match(RPAR);
				}
				break;
			case TURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(TURE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FunctionCraftParser.STRING, 0); }
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode FLOAT() { return getToken(FunctionCraftParser.FLOAT, 0); }
		public TerminalNode TURE() { return getToken(FunctionCraftParser.TURE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Func_ptrContext func_ptr() {
			return getRuleContext(Func_ptrContext.class,0);
		}
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_const);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(STRING);
				}
				break;
			case INT_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(INT_VAL);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(FLOAT);
				}
				break;
			case TURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				match(TURE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
				match(FALSE);
				}
				break;
			case LBRAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				list();
				}
				break;
			case METHOD:
				enterOuterAlt(_localctx, 7);
				{
				setState(334);
				func_ptr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_ptrContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Func_ptrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_ptr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunc_ptr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunc_ptr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunc_ptr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_ptrContext func_ptr() throws RecognitionException {
		Func_ptrContext _localctx = new Func_ptrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(METHOD);
			setState(338);
			match(LPAR);
			setState(339);
			match(COLON);
			setState(340);
			match(IDENTIFIER);
			setState(341);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompContext extends ParserRuleContext {
		public Token name;
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comp);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				((CompContext)_localctx).name = match(AND);
				System.out.println("Operator: " + (((CompContext)_localctx).name!=null?((CompContext)_localctx).name.getText():null));
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				((CompContext)_localctx).name = match(OR);
				System.out.println("Operator: " + (((CompContext)_localctx).name!=null?((CompContext)_localctx).name.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Body_funcContext extends ParserRuleContext {
		public BlablaContext blabla() {
			return getRuleContext(BlablaContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FunctionCraftParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FunctionCraftParser.SEMICOLON, i);
		}
		public List<IfcondiContext> ifcondi() {
			return getRuleContexts(IfcondiContext.class);
		}
		public IfcondiContext ifcondi(int i) {
			return getRuleContext(IfcondiContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<TerminalNode> INLINECOMMENT() { return getTokens(FunctionCraftParser.INLINECOMMENT); }
		public TerminalNode INLINECOMMENT(int i) {
			return getToken(FunctionCraftParser.INLINECOMMENT, i);
		}
		public List<TerminalNode> MULLINECOMMENT() { return getTokens(FunctionCraftParser.MULLINECOMMENT); }
		public TerminalNode MULLINECOMMENT(int i) {
			return getToken(FunctionCraftParser.MULLINECOMMENT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionCraftParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionCraftParser.NEWLINE, i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<AppendContext> append() {
			return getRuleContexts(AppendContext.class);
		}
		public AppendContext append(int i) {
			return getRuleContext(AppendContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public Ret_expContext ret_exp() {
			return getRuleContext(Ret_expContext.class,0);
		}
		public Body_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBody_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBody_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBody_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_funcContext body_func() throws RecognitionException {
		Body_funcContext _localctx = new Body_funcContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_body_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(361);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LEN:
					case CHOP:
					case CHOMP:
					case PUSH:
					case PUTS:
					case IDENTIFIER:
					case STRING:
						{
						setState(352);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(349);
							function_call();
							}
							break;
						case 2:
							{
							setState(350);
							assign();
							}
							break;
						case 3:
							{
							setState(351);
							append();
							}
							break;
						}
						setState(354);
						match(SEMICOLON);
						}
						break;
					case IF:
						{
						setState(356);
						ifcondi();
						}
						break;
					case LOOP:
					case FOR:
						{
						setState(357);
						loop();
						}
						break;
					case INLINECOMMENT:
						{
						setState(358);
						match(INLINECOMMENT);
						}
						break;
					case MULLINECOMMENT:
						{
						setState(359);
						match(MULLINECOMMENT);
						}
						break;
					case NEWLINE:
						{
						setState(360);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				{
				setState(366);
				match(RETURN);
				System.out.println("RETURN");
				setState(368);
				ret_exp();
				}
				setState(370);
				match(SEMICOLON);
				}
			}

			setState(374);
			blabla();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ret_expContext extends ParserRuleContext {
		public CondiContext condi() {
			return getRuleContext(CondiContext.class,0);
		}
		public Logic_expContext logic_exp() {
			return getRuleContext(Logic_expContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Ret_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRet_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRet_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRet_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ret_expContext ret_exp() throws RecognitionException {
		Ret_expContext _localctx = new Ret_expContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ret_exp);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(376);
					condi();
					}
					break;
				case 2:
					{
					setState(377);
					logic_exp();
					}
					break;
				case 3:
					{
					setState(378);
					exp(0);
					}
					break;
				case 4:
					{
					setState(379);
					lambda();
					}
					break;
				case 5:
					{
					setState(380);
					append();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(LPAR);
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(384);
					condi();
					}
					break;
				case 2:
					{
					setState(385);
					logic_exp();
					}
					break;
				case 3:
					{
					setState(386);
					exp(0);
					}
					break;
				case 4:
					{
					setState(387);
					lambda();
					}
					break;
				case 5:
					{
					setState(388);
					append();
					}
					break;
				}
				setState(391);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public Token name;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Func_ptrContext func_ptr() {
			return getRuleContext(Func_ptrContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			((AssignContext)_localctx).name = match(IDENTIFIER);
			System.out.println("Assignment: " + (((AssignContext)_localctx).name!=null?((AssignContext)_localctx).name.getText():null));
			setState(397);
			assignment();
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
			case LPAR:
			case LBRAK:
			case MINUS:
			case LEN:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case TURE:
			case FALSE:
			case IDENTIFIER:
			case STRING:
				{
				setState(398);
				exp(0);
				}
				break;
			case METHOD:
				{
				setState(399);
				func_ptr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode PASSIGN() { return getToken(FunctionCraftParser.PASSIGN, 0); }
		public TerminalNode MASSIGN() { return getToken(FunctionCraftParser.MASSIGN, 0); }
		public TerminalNode OASSIGN() { return getToken(FunctionCraftParser.OASSIGN, 0); }
		public TerminalNode DASSIGN() { return getToken(FunctionCraftParser.DASSIGN, 0); }
		public TerminalNode RASSIGN() { return getToken(FunctionCraftParser.RASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33822867456L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppendContext extends ParserRuleContext {
		public Token name;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> APPEND() { return getTokens(FunctionCraftParser.APPEND); }
		public TerminalNode APPEND(int i) {
			return getToken(FunctionCraftParser.APPEND, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(FunctionCraftParser.STRING, 0); }
		public List<TerminalNode> LBRAK() { return getTokens(FunctionCraftParser.LBRAK); }
		public TerminalNode LBRAK(int i) {
			return getToken(FunctionCraftParser.LBRAK, i);
		}
		public List<TerminalNode> RBRAK() { return getTokens(FunctionCraftParser.RBRAK); }
		public TerminalNode RBRAK(int i) {
			return getToken(FunctionCraftParser.RBRAK, i);
		}
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_append);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(404);
				match(IDENTIFIER);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRAK) {
					{
					{
					setState(405);
					match(LBRAK);
					setState(406);
					exp(0);
					setState(407);
					match(RBRAK);
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				{
				setState(414);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(417);
			((AppendContext)_localctx).name = match(APPEND);
			System.out.println("Operator: " + (((AppendContext)_localctx).name!=null?((AppendContext)_localctx).name.getText():null));
			setState(419);
			exp(0);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==APPEND) {
				{
				{
				setState(420);
				((AppendContext)_localctx).name = match(APPEND);
				System.out.println("Operator: " + (((AppendContext)_localctx).name!=null?((AppendContext)_localctx).name.getText():null));
				setState(422);
				exp(0);
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfcondiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public List<Body_funcContext> body_func() {
			return getRuleContexts(Body_funcContext.class);
		}
		public Body_funcContext body_func(int i) {
			return getRuleContext(Body_funcContext.class,i);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<CondiContext> condi() {
			return getRuleContexts(CondiContext.class);
		}
		public CondiContext condi(int i) {
			return getRuleContext(CondiContext.class,i);
		}
		public List<Logic_expContext> logic_exp() {
			return getRuleContexts(Logic_expContext.class);
		}
		public Logic_expContext logic_exp(int i) {
			return getRuleContext(Logic_expContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(FunctionCraftParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(FunctionCraftParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public IfcondiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcondi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIfcondi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIfcondi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIfcondi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfcondiContext ifcondi() throws RecognitionException {
		IfcondiContext _localctx = new IfcondiContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifcondi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(IF);
			System.out.println("Decision: IF");
			setState(430);
			match(LPAR);
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(431);
				condi();
				}
				break;
			case 2:
				{
				setState(432);
				logic_exp();
				}
				break;
			}
			setState(435);
			match(RPAR);
			setState(436);
			body_func();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(437);
				match(ELSEIF);
				System.out.println("Decision: ELSE IF");
				setState(439);
				match(LPAR);
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(440);
					condi();
					}
					break;
				case 2:
					{
					setState(441);
					logic_exp();
					}
					break;
				}
				setState(444);
				match(RPAR);
				setState(445);
				body_func();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(452);
				match(ELSE);
				System.out.println("Decision: ELSE");
				setState(454);
				body_func();
				}
			}

			setState(457);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public ForinContext forin() {
			return getRuleContext(ForinContext.class,0);
		}
		public LoopdoContext loopdo() {
			return getRuleContext(LoopdoContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loop);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				forin();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				loopdo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopdoContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(FunctionCraftParser.LOOP, 0); }
		public TerminalNode DO() { return getToken(FunctionCraftParser.DO, 0); }
		public BodyloopContext bodyloop() {
			return getRuleContext(BodyloopContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public LoopdoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopdo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoopdo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoopdo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoopdo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopdoContext loopdo() throws RecognitionException {
		LoopdoContext _localctx = new LoopdoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loopdo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(LOOP);
			setState(464);
			match(DO);
			System.out.println("Loop: DO");
			setState(466);
			bodyloop();
			setState(467);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyloopContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(FunctionCraftParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FunctionCraftParser.SEMICOLON, i);
		}
		public List<IfcondiContext> ifcondi() {
			return getRuleContexts(IfcondiContext.class);
		}
		public IfcondiContext ifcondi(int i) {
			return getRuleContext(IfcondiContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<TerminalNode> INLINECOMMENT() { return getTokens(FunctionCraftParser.INLINECOMMENT); }
		public TerminalNode INLINECOMMENT(int i) {
			return getToken(FunctionCraftParser.INLINECOMMENT, i);
		}
		public List<TerminalNode> MULLINECOMMENT() { return getTokens(FunctionCraftParser.MULLINECOMMENT); }
		public TerminalNode MULLINECOMMENT(int i) {
			return getToken(FunctionCraftParser.MULLINECOMMENT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionCraftParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionCraftParser.NEWLINE, i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<For_condiContext> for_condi() {
			return getRuleContexts(For_condiContext.class);
		}
		public For_condiContext for_condi(int i) {
			return getRuleContext(For_condiContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<AppendContext> append() {
			return getRuleContexts(AppendContext.class);
		}
		public AppendContext append(int i) {
			return getRuleContext(AppendContext.class,i);
		}
		public BodyloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBodyloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBodyloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBodyloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyloopContext bodyloop() throws RecognitionException {
		BodyloopContext _localctx = new BodyloopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bodyloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(482);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEN:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case NEXT:
				case BREAK:
				case IDENTIFIER:
				case STRING:
					{
					setState(473);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(469);
						function_call();
						}
						break;
					case 2:
						{
						setState(470);
						for_condi();
						}
						break;
					case 3:
						{
						setState(471);
						assign();
						}
						break;
					case 4:
						{
						setState(472);
						append();
						}
						break;
					}
					setState(475);
					match(SEMICOLON);
					}
					break;
				case IF:
					{
					setState(477);
					ifcondi();
					}
					break;
				case LOOP:
				case FOR:
					{
					setState(478);
					loop();
					}
					break;
				case INLINECOMMENT:
					{
					setState(479);
					match(INLINECOMMENT);
					}
					break;
				case MULLINECOMMENT:
					{
					setState(480);
					match(MULLINECOMMENT);
					}
					break;
				case NEWLINE:
					{
					setState(481);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(484); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & 16282911L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForinContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public BodyloopContext bodyloop() {
			return getRuleContext(BodyloopContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public ForinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterForin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitForin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitForin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForinContext forin() throws RecognitionException {
		ForinContext _localctx = new ForinContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(FOR);
			System.out.println("Loop: FOR");
			setState(488);
			match(IDENTIFIER);
			setState(489);
			match(IN);
			setState(490);
			range();
			setState(491);
			bodyloop();
			setState(492);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<TerminalNode> INT_VAL() { return getTokens(FunctionCraftParser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(FunctionCraftParser.INT_VAL, i);
		}
		public TerminalNode DDOT() { return getToken(FunctionCraftParser.DDOT, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_range);
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(LPAR);
				{
				setState(495);
				match(INT_VAL);
				setState(496);
				match(DDOT);
				setState(497);
				match(INT_VAL);
				}
				setState(499);
				match(RPAR);
				}
				break;
			case LBRAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Built_inContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public Built_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBuilt_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBuilt_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBuilt_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_inContext built_in() throws RecognitionException {
		Built_inContext _localctx = new Built_inContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_built_in);
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(PUTS);
				System.out.println("Bulit-In: PUTS");
				}
				break;
			case PUSH:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(PUSH);
				System.out.println("Bulit-In: PUSH");
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				match(LEN);
				System.out.println("Bulit-In: LEN");
				}
				break;
			case CHOMP:
				enterOuterAlt(_localctx, 4);
				{
				setState(509);
				match(CHOMP);
				System.out.println("Bulit-In: CHOMP");
				}
				break;
			case CHOP:
				enterOuterAlt(_localctx, 5);
				{
				setState(511);
				match(CHOP);
				System.out.println("Bulit-In: CHOP");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_condiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public CondiContext condi() {
			return getRuleContext(CondiContext.class,0);
		}
		public Logic_expContext logic_exp() {
			return getRuleContext(Logic_expContext.class,0);
		}
		public For_condiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_condi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFor_condi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFor_condi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFor_condi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_condiContext for_condi() throws RecognitionException {
		For_condiContext _localctx = new For_condiContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_for_condi);
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEXT:
					{
					setState(515);
					match(NEXT);
					System.out.println("Control: NEXT");
					}
					break;
				case BREAK:
					{
					setState(517);
					match(BREAK);
					System.out.println("Control: BREAK");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(521);
				match(IF);
				setState(522);
				match(LPAR);
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(523);
					condi();
					}
					break;
				case 2:
					{
					setState(524);
					logic_exp();
					}
					break;
				}
				setState(527);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				match(NEXT);
				System.out.println("Control: NEXT");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				match(BREAK);
				System.out.println("Control: BREAK");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u0218\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000"+
		"E\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"K\b\u0001\n\u0001\f\u0001N\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"X\b\u0002\u0003\u0002Z\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003o\b\u0003\n\u0003"+
		"\f\u0003r\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003v\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004{\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0080\b\u0004\u0005\u0004\u0082\b\u0004\n\u0004"+
		"\f\u0004\u0085\t\u0004\u0003\u0004\u0087\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0096\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		"\u009c\b\u0005\u000b\u0005\f\u0005\u009d\u0001\u0005\u0004\u0005\u00a1"+
		"\b\u0005\u000b\u0005\f\u0005\u00a2\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b2\b\u0007"+
		"\n\u0007\f\u0007\u00b5\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u00bf\b\b\n\b\f\b\u00c2\t\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0004\t\u00cf\b\t\u000b\t\f\t\u00d0\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00df\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ec\b\t\n\t\f\t\u00ef\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f6\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0104\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u010b\b\f\n\f\f\f\u010e"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0118\b\f\n\f\f\f\u011b\t\f\u0003\f\u011d\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0128\b\f\n"+
		"\f\f\f\u012b\t\f\u0001\f\u0001\f\u0003\f\u012f\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0134\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0141\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0147\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0150\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u015c\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0161\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u016a\b\u0011\n\u0011\f\u0011\u016d\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0175\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u017e\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0186\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u018a\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0191\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u019a\b\u0015\n\u0015\f\u0015\u019d\t\u0015\u0001\u0015\u0003\u0015\u01a0"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u01a8\b\u0015\n\u0015\f\u0015\u01ab\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01b2\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u01bb\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u01c0\b\u0016\n\u0016\f\u0016\u01c3\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u01c8\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u01ce\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u01da\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u01e3"+
		"\b\u0019\u000b\u0019\f\u0019\u01e4\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u01f6\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0202\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0208\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u020e\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0216\b\u001d\u0001\u001d\u0000\u0001"+
		"\u0012\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0003\u0001\u0000@B\u0002"+
		"\u0000\f\u000f\u0012\u0012\u0001\u0000\u001d\"\u025f\u0000C\u0001\u0000"+
		"\u0000\u0000\u0002L\u0001\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000"+
		"\u0006_\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000\u0000\n\u008a\u0001"+
		"\u0000\u0000\u0000\f\u00a6\u0001\u0000\u0000\u0000\u000e\u00ae\u0001\u0000"+
		"\u0000\u0000\u0010\u00b6\u0001\u0000\u0000\u0000\u0012\u00de\u0001\u0000"+
		"\u0000\u0000\u0014\u00f5\u0001\u0000\u0000\u0000\u0016\u0103\u0001\u0000"+
		"\u0000\u0000\u0018\u012e\u0001\u0000\u0000\u0000\u001a\u0146\u0001\u0000"+
		"\u0000\u0000\u001c\u014f\u0001\u0000\u0000\u0000\u001e\u0151\u0001\u0000"+
		"\u0000\u0000 \u015b\u0001\u0000\u0000\u0000\"\u016b\u0001\u0000\u0000"+
		"\u0000$\u0189\u0001\u0000\u0000\u0000&\u018b\u0001\u0000\u0000\u0000("+
		"\u0192\u0001\u0000\u0000\u0000*\u019f\u0001\u0000\u0000\u0000,\u01ac\u0001"+
		"\u0000\u0000\u0000.\u01cd\u0001\u0000\u0000\u00000\u01cf\u0001\u0000\u0000"+
		"\u00002\u01e2\u0001\u0000\u0000\u00004\u01e6\u0001\u0000\u0000\u00006"+
		"\u01f5\u0001\u0000\u0000\u00008\u0201\u0001\u0000\u0000\u0000:\u0215\u0001"+
		"\u0000\u0000\u0000<B\u0005A\u0000\u0000=B\u0005B\u0000\u0000>B\u0003\u0004"+
		"\u0002\u0000?B\u0005@\u0000\u0000@B\u0003\n\u0005\u0000A<\u0001\u0000"+
		"\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FG\u0003\f\u0006\u0000GH\u0003\u0002\u0001"+
		"\u0000H\u0001\u0001\u0000\u0000\u0000IK\u0007\u0000\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000M\u0003\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OP\u0005&\u0000\u0000PQ\u0005>\u0000\u0000QR\u0006\u0002\uffff"+
		"\uffff\u0000RY\u0005\u0003\u0000\u0000SZ\u0003\u0010\b\u0000TW\u0003\u000e"+
		"\u0007\u0000UV\u0005\u0007\u0000\u0000VX\u0003\u0010\b\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YS\u0001"+
		"\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[\\\u0005\u0004\u0000\u0000\\]\u0003\"\u0011"+
		"\u0000]^\u0005\'\u0000\u0000^\u0005\u0001\u0000\u0000\u0000_`\u0005*\u0000"+
		"\u0000`a\u0006\u0003\uffff\uffff\u0000ab\u0005\u0003\u0000\u0000bc\u0003"+
		"\u000e\u0007\u0000cd\u0005\u0004\u0000\u0000de\u00051\u0000\u0000ef\u0005"+
		"(\u0000\u0000fg\u0006\u0003\uffff\uffff\u0000gh\u0003$\u0012\u0000hi\u0005"+
		"\u000b\u0000\u0000iu\u00052\u0000\u0000jk\u0005\u0003\u0000\u0000kp\u0003"+
		"\u0012\t\u0000lm\u0005\u0007\u0000\u0000mo\u0003\u0012\t\u0000nl\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000st\u0005\u0004\u0000\u0000tv\u0001\u0000\u0000\u0000uj\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0007\u0001\u0000\u0000\u0000"+
		"w\u0086\u0005\u0005\u0000\u0000x{\u0003\b\u0004\u0000y{\u0003\u0012\t"+
		"\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u0083\u0001"+
		"\u0000\u0000\u0000|\u007f\u0005\u0007\u0000\u0000}\u0080\u0003\b\u0004"+
		"\u0000~\u0080\u0003\u0012\t\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081|\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0087\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086z\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005\u0006\u0000\u0000\u0089\t\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005$\u0000\u0000\u008b\u008c\u0005>\u0000\u0000\u008c"+
		"\u008d\u0006\u0005\uffff\uffff\u0000\u008d\u008e\u0005\u0003\u0000\u0000"+
		"\u008e\u008f\u0003\u000e\u0007\u0000\u008f\u009b\u0005\u0004\u0000\u0000"+
		"\u0090\u0091\u0005@\u0000\u0000\u0091\u0092\u0005#\u0000\u0000\u0092\u0095"+
		"\u0005\u0003\u0000\u0000\u0093\u0096\u0003\u001a\r\u0000\u0094\u0096\u0003"+
		"\u0014\n\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0004"+
		"\u0000\u0000\u0098\u0099\u0005\u001d\u0000\u0000\u0099\u009a\u0003\u0012"+
		"\t\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0090\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000"+
		"\u0000\u009f\u00a1\u0005@\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005\u000b\u0000\u0000\u00a5\u000b\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005&\u0000\u0000\u00a7\u00a8\u00050\u0000\u0000\u00a8\u00a9"+
		"\u0006\u0006\uffff\uffff\u0000\u00a9\u00aa\u0005\u0003\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0004\u0000\u0000\u00ab\u00ac\u0003\"\u0011\u0000\u00ac\u00ad"+
		"\u0005\'\u0000\u0000\u00ad\r\u0001\u0000\u0000\u0000\u00ae\u00b3\u0005"+
		">\u0000\u0000\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0\u00b2\u0005>\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u000f\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005\u0005\u0000\u0000\u00b7\u00b8\u0005>\u0000\u0000"+
		"\u00b8\u00b9\u0005\u001d\u0000\u0000\u00b9\u00c0\u0003\u0012\t\u0000\u00ba"+
		"\u00bb\u0005\u0007\u0000\u0000\u00bb\u00bc\u0005>\u0000\u0000\u00bc\u00bd"+
		"\u0005\u001d\u0000\u0000\u00bd\u00bf\u0003\u0012\t\u0000\u00be\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"\u0006\u0000\u0000\u00c4\u0011\u0001\u0000\u0000\u0000\u00c5\u00c6\u0006"+
		"\t\uffff\uffff\u0000\u00c6\u00c7\u0005\r\u0000\u0000\u00c7\u00c8\u0006"+
		"\t\uffff\uffff\u0000\u00c8\u00df\u0003\u0012\t\f\u00c9\u00ce\u0005>\u0000"+
		"\u0000\u00ca\u00cb\u0005\u0005\u0000\u0000\u00cb\u00cc\u0003\u0012\t\u0000"+
		"\u00cc\u00cd\u0005\u0006\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000"+
		"\u00ce\u00ca\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00df\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0003\u0000\u0000"+
		"\u00d3\u00d4\u0003\u0012\t\u0000\u00d4\u00d5\u0005\u0004\u0000\u0000\u00d5"+
		"\u00df\u0001\u0000\u0000\u0000\u00d6\u00df\u0005?\u0000\u0000\u00d7\u00df"+
		"\u0005<\u0000\u0000\u00d8\u00d9\u0005=\u0000\u0000\u00d9\u00df\u0005\u0002"+
		"\u0000\u0000\u00da\u00df\u0005\u0001\u0000\u0000\u00db\u00df\u0003\u0018"+
		"\f\u0000\u00dc\u00df\u0003\b\u0004\u0000\u00dd\u00df\u0005>\u0000\u0000"+
		"\u00de\u00c5\u0001\u0000\u0000\u0000\u00de\u00c9\u0001\u0000\u0000\u0000"+
		"\u00de\u00d2\u0001\u0000\u0000\u0000\u00de\u00d6\u0001\u0000\u0000\u0000"+
		"\u00de\u00d7\u0001\u0000\u0000\u0000\u00de\u00d8\u0001\u0000\u0000\u0000"+
		"\u00de\u00da\u0001\u0000\u0000\u0000\u00de\u00db\u0001\u0000\u0000\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000"+
		"\u00df\u00ed\u0001\u0000\u0000\u0000\u00e0\u00e1\n\r\u0000\u0000\u00e1"+
		"\u00e2\u0007\u0001\u0000\u0000\u00e2\u00e3\u0003\u0012\t\u000e\u00e3\u00e4"+
		"\u0006\t\uffff\uffff\u0000\u00e4\u00ec\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\n\u000b\u0000\u0000\u00e6\u00e7\u0005\u0010\u0000\u0000\u00e7\u00ec\u0006"+
		"\t\uffff\uffff\u0000\u00e8\u00e9\n\n\u0000\u0000\u00e9\u00ea\u0005\u0011"+
		"\u0000\u0000\u00ea\u00ec\u0006\t\uffff\uffff\u0000\u00eb\u00e0\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000\u00eb\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u0013\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003\u0012"+
		"\t\u0000\u00f1\u00f2\u0003\u0016\u000b\u0000\u00f2\u00f3\u0003\u0012\t"+
		"\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f6\u0003\u0012\t\u0000"+
		"\u00f5\u00f0\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u0015\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0017\u0000\u0000"+
		"\u00f8\u0104\u0006\u000b\uffff\uffff\u0000\u00f9\u00fa\u0005\u0018\u0000"+
		"\u0000\u00fa\u0104\u0006\u000b\uffff\uffff\u0000\u00fb\u00fc\u0005\u0013"+
		"\u0000\u0000\u00fc\u0104\u0006\u000b\uffff\uffff\u0000\u00fd\u00fe\u0005"+
		"\u0014\u0000\u0000\u00fe\u0104\u0006\u000b\uffff\uffff\u0000\u00ff\u0100"+
		"\u0005\u0016\u0000\u0000\u0100\u0104\u0006\u000b\uffff\uffff\u0000\u0101"+
		"\u0102\u0005\u0015\u0000\u0000\u0102\u0104\u0006\u000b\uffff\uffff\u0000"+
		"\u0103\u00f7\u0001\u0000\u0000\u0000\u0103\u00f9\u0001\u0000\u0000\u0000"+
		"\u0103\u00fb\u0001\u0000\u0000\u0000\u0103\u00fd\u0001\u0000\u0000\u0000"+
		"\u0103\u00ff\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0104\u0017\u0001\u0000\u0000\u0000\u0105\u0106\u00038\u001c\u0000\u0106"+
		"\u0107\u0005\u0003\u0000\u0000\u0107\u010c\u0003$\u0012\u0000\u0108\u0109"+
		"\u0005\u0007\u0000\u0000\u0109\u010b\u0003$\u0012\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0001"+
		"\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0110\u0005"+
		"\u0004\u0000\u0000\u0110\u012f\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		">\u0000\u0000\u0112\u0113\u0006\f\uffff\uffff\u0000\u0113\u011c\u0005"+
		"\u0003\u0000\u0000\u0114\u0119\u0003$\u0012\u0000\u0115\u0116\u0005\u0007"+
		"\u0000\u0000\u0116\u0118\u0003$\u0012\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u0114\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011e\u012f\u0005\u0004\u0000\u0000\u011f\u0120\u0005>\u0000\u0000"+
		"\u0120\u0121\u0005\b\u0000\u0000\u0121\u0122\u0005%\u0000\u0000\u0122"+
		"\u0123\u0006\f\uffff\uffff\u0000\u0123\u0124\u0005\u0003\u0000\u0000\u0124"+
		"\u0129\u0003$\u0012\u0000\u0125\u0126\u0005\u0007\u0000\u0000\u0126\u0128"+
		"\u0003$\u0012\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u012b\u0001"+
		"\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001"+
		"\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0129\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0005\u0004\u0000\u0000\u012d\u012f\u0001"+
		"\u0000\u0000\u0000\u012e\u0105\u0001\u0000\u0000\u0000\u012e\u0111\u0001"+
		"\u0000\u0000\u0000\u012e\u011f\u0001\u0000\u0000\u0000\u012f\u0019\u0001"+
		"\u0000\u0000\u0000\u0130\u0133\u0005\u0003\u0000\u0000\u0131\u0134\u0003"+
		"\u0014\n\u0000\u0132\u0134\u0003\u001a\r\u0000\u0133\u0131\u0001\u0000"+
		"\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0005\u0004\u0000\u0000\u0136\u0137\u0003 \u0010"+
		"\u0000\u0137\u0138\u0005\u0003\u0000\u0000\u0138\u0139\u0003\u0014\n\u0000"+
		"\u0139\u013a\u0005\u0004\u0000\u0000\u013a\u0147\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0005\u001b\u0000\u0000\u013c\u013d\u0006\r\uffff\uffff\u0000"+
		"\u013d\u0140\u0005\u0003\u0000\u0000\u013e\u0141\u0003\u001a\r\u0000\u013f"+
		"\u0141\u0003\u0014\n\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u013f"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0005\u0004\u0000\u0000\u0143\u0147\u0001\u0000\u0000\u0000\u0144\u0147"+
		"\u0005<\u0000\u0000\u0145\u0147\u0005=\u0000\u0000\u0146\u0130\u0001\u0000"+
		"\u0000\u0000\u0146\u013b\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u001b\u0001\u0000"+
		"\u0000\u0000\u0148\u0150\u0005?\u0000\u0000\u0149\u0150\u0005\u0001\u0000"+
		"\u0000\u014a\u0150\u0005\u0002\u0000\u0000\u014b\u0150\u0005<\u0000\u0000"+
		"\u014c\u0150\u0005=\u0000\u0000\u014d\u0150\u0003\b\u0004\u0000\u014e"+
		"\u0150\u0003\u001e\u000f\u0000\u014f\u0148\u0001\u0000\u0000\u0000\u014f"+
		"\u0149\u0001\u0000\u0000\u0000\u014f\u014a\u0001\u0000\u0000\u0000\u014f"+
		"\u014b\u0001\u0000\u0000\u0000\u014f\u014c\u0001\u0000\u0000\u0000\u014f"+
		"\u014d\u0001\u0000\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150"+
		"\u001d\u0001\u0000\u0000\u0000\u0151\u0152\u0005)\u0000\u0000\u0152\u0153"+
		"\u0005\u0003\u0000\u0000\u0153\u0154\u0005\n\u0000\u0000\u0154\u0155\u0005"+
		">\u0000\u0000\u0155\u0156\u0005\u0004\u0000\u0000\u0156\u001f\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0005\u0019\u0000\u0000\u0158\u015c\u0006\u0010"+
		"\uffff\uffff\u0000\u0159\u015a\u0005\u001a\u0000\u0000\u015a\u015c\u0006"+
		"\u0010\uffff\uffff\u0000\u015b\u0157\u0001\u0000\u0000\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015c!\u0001\u0000\u0000\u0000\u015d\u0161\u0003"+
		"\u0018\f\u0000\u015e\u0161\u0003&\u0013\u0000\u015f\u0161\u0003*\u0015"+
		"\u0000\u0160\u015d\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000"+
		"\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005\u000b\u0000\u0000\u0163\u016a\u0001\u0000\u0000"+
		"\u0000\u0164\u016a\u0003,\u0016\u0000\u0165\u016a\u0003.\u0017\u0000\u0166"+
		"\u016a\u0005A\u0000\u0000\u0167\u016a\u0005B\u0000\u0000\u0168\u016a\u0005"+
		"@\u0000\u0000\u0169\u0160\u0001\u0000\u0000\u0000\u0169\u0164\u0001\u0000"+
		"\u0000\u0000\u0169\u0165\u0001\u0000\u0000\u0000\u0169\u0166\u0001\u0000"+
		"\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000"+
		"\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u0174\u0001\u0000"+
		"\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u016f\u0005(\u0000"+
		"\u0000\u016f\u0170\u0006\u0011\uffff\uffff\u0000\u0170\u0171\u0003$\u0012"+
		"\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u000b\u0000"+
		"\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u016e\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0003\u0002\u0001\u0000\u0177#\u0001\u0000\u0000\u0000"+
		"\u0178\u017e\u0003\u001a\r\u0000\u0179\u017e\u0003\u0014\n\u0000\u017a"+
		"\u017e\u0003\u0012\t\u0000\u017b\u017e\u0003\u0006\u0003\u0000\u017c\u017e"+
		"\u0003*\u0015\u0000\u017d\u0178\u0001\u0000\u0000\u0000\u017d\u0179\u0001"+
		"\u0000\u0000\u0000\u017d\u017a\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u018a\u0001"+
		"\u0000\u0000\u0000\u017f\u0185\u0005\u0003\u0000\u0000\u0180\u0186\u0003"+
		"\u001a\r\u0000\u0181\u0186\u0003\u0014\n\u0000\u0182\u0186\u0003\u0012"+
		"\t\u0000\u0183\u0186\u0003\u0006\u0003\u0000\u0184\u0186\u0003*\u0015"+
		"\u0000\u0185\u0180\u0001\u0000\u0000\u0000\u0185\u0181\u0001\u0000\u0000"+
		"\u0000\u0185\u0182\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000"+
		"\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0005\u0004\u0000\u0000\u0188\u018a\u0001\u0000\u0000"+
		"\u0000\u0189\u017d\u0001\u0000\u0000\u0000\u0189\u017f\u0001\u0000\u0000"+
		"\u0000\u018a%\u0001\u0000\u0000\u0000\u018b\u018c\u0005>\u0000\u0000\u018c"+
		"\u018d\u0006\u0013\uffff\uffff\u0000\u018d\u0190\u0003(\u0014\u0000\u018e"+
		"\u0191\u0003\u0012\t\u0000\u018f\u0191\u0003\u001e\u000f\u0000\u0190\u018e"+
		"\u0001\u0000\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191\'\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0007\u0002\u0000\u0000\u0193)\u0001\u0000"+
		"\u0000\u0000\u0194\u019b\u0005>\u0000\u0000\u0195\u0196\u0005\u0005\u0000"+
		"\u0000\u0196\u0197\u0003\u0012\t\u0000\u0197\u0198\u0005\u0006\u0000\u0000"+
		"\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0195\u0001\u0000\u0000\u0000"+
		"\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u01a0\u0001\u0000\u0000\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u01a0\u0005?\u0000\u0000\u019f"+
		"\u0194\u0001\u0000\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u001c\u0000\u0000\u01a2"+
		"\u01a3\u0006\u0015\uffff\uffff\u0000\u01a3\u01a9\u0003\u0012\t\u0000\u01a4"+
		"\u01a5\u0005\u001c\u0000\u0000\u01a5\u01a6\u0006\u0015\uffff\uffff\u0000"+
		"\u01a6\u01a8\u0003\u0012\t\u0000\u01a7\u01a4\u0001\u0000\u0000\u0000\u01a8"+
		"\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0001\u0000\u0000\u0000\u01aa+\u0001\u0000\u0000\u0000\u01ab\u01a9"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u00059\u0000\u0000\u01ad\u01ae\u0006"+
		"\u0016\uffff\uffff\u0000\u01ae\u01b1\u0005\u0003\u0000\u0000\u01af\u01b2"+
		"\u0003\u001a\r\u0000\u01b0\u01b2\u0003\u0014\n\u0000\u01b1\u01af\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0005\u0004\u0000\u0000\u01b4\u01c1\u0003"+
		"\"\u0011\u0000\u01b5\u01b6\u0005;\u0000\u0000\u01b6\u01b7\u0006\u0016"+
		"\uffff\uffff\u0000\u01b7\u01ba\u0005\u0003\u0000\u0000\u01b8\u01bb\u0003"+
		"\u001a\r\u0000\u01b9\u01bb\u0003\u0014\n\u0000\u01ba\u01b8\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bd\u0005\u0004\u0000\u0000\u01bd\u01be\u0003\"\u0011"+
		"\u0000\u01be\u01c0\u0001\u0000\u0000\u0000\u01bf\u01b5\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005:\u0000\u0000"+
		"\u01c5\u01c6\u0006\u0016\uffff\uffff\u0000\u01c6\u01c8\u0003\"\u0011\u0000"+
		"\u01c7\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\'\u0000\u0000\u01ca"+
		"-\u0001\u0000\u0000\u0000\u01cb\u01ce\u00034\u001a\u0000\u01cc\u01ce\u0003"+
		"0\u0018\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001\u0000"+
		"\u0000\u0000\u01ce/\u0001\u0000\u0000\u0000\u01cf\u01d0\u00053\u0000\u0000"+
		"\u01d0\u01d1\u00054\u0000\u0000\u01d1\u01d2\u0006\u0018\uffff\uffff\u0000"+
		"\u01d2\u01d3\u00032\u0019\u0000\u01d3\u01d4\u0005\'\u0000\u0000\u01d4"+
		"1\u0001\u0000\u0000\u0000\u01d5\u01da\u0003\u0018\f\u0000\u01d6\u01da"+
		"\u0003:\u001d\u0000\u01d7\u01da\u0003&\u0013\u0000\u01d8\u01da\u0003*"+
		"\u0015\u0000\u01d9\u01d5\u0001\u0000\u0000\u0000\u01d9\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01d8\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0005\u000b"+
		"\u0000\u0000\u01dc\u01e3\u0001\u0000\u0000\u0000\u01dd\u01e3\u0003,\u0016"+
		"\u0000\u01de\u01e3\u0003.\u0017\u0000\u01df\u01e3\u0005A\u0000\u0000\u01e0"+
		"\u01e3\u0005B\u0000\u0000\u01e1\u01e3\u0005@\u0000\u0000\u01e2\u01d9\u0001"+
		"\u0000\u0000\u0000\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e2\u01de\u0001"+
		"\u0000\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e53\u0001\u0000\u0000\u0000\u01e6\u01e7\u00055\u0000"+
		"\u0000\u01e7\u01e8\u0006\u001a\uffff\uffff\u0000\u01e8\u01e9\u0005>\u0000"+
		"\u0000\u01e9\u01ea\u00056\u0000\u0000\u01ea\u01eb\u00036\u001b\u0000\u01eb"+
		"\u01ec\u00032\u0019\u0000\u01ec\u01ed\u0005\'\u0000\u0000\u01ed5\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ef\u0005\u0003\u0000\u0000\u01ef\u01f0\u0005"+
		"\u0001\u0000\u0000\u01f0\u01f1\u0005\t\u0000\u0000\u01f1\u01f2\u0005\u0001"+
		"\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f6\u0005\u0004"+
		"\u0000\u0000\u01f4\u01f6\u0003\b\u0004\u0000\u01f5\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f67\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0005/\u0000\u0000\u01f8\u0202\u0006\u001c\uffff\uffff\u0000"+
		"\u01f9\u01fa\u0005.\u0000\u0000\u01fa\u0202\u0006\u001c\uffff\uffff\u0000"+
		"\u01fb\u01fc\u0005+\u0000\u0000\u01fc\u0202\u0006\u001c\uffff\uffff\u0000"+
		"\u01fd\u01fe\u0005-\u0000\u0000\u01fe\u0202\u0006\u001c\uffff\uffff\u0000"+
		"\u01ff\u0200\u0005,\u0000\u0000\u0200\u0202\u0006\u001c\uffff\uffff\u0000"+
		"\u0201\u01f7\u0001\u0000\u0000\u0000\u0201\u01f9\u0001\u0000\u0000\u0000"+
		"\u0201\u01fb\u0001\u0000\u0000\u0000\u0201\u01fd\u0001\u0000\u0000\u0000"+
		"\u0201\u01ff\u0001\u0000\u0000\u0000\u02029\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u00057\u0000\u0000\u0204\u0208\u0006\u001d\uffff\uffff\u0000\u0205"+
		"\u0206\u00058\u0000\u0000\u0206\u0208\u0006\u001d\uffff\uffff\u0000\u0207"+
		"\u0203\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u00059\u0000\u0000\u020a\u020d"+
		"\u0005\u0003\u0000\u0000\u020b\u020e\u0003\u001a\r\u0000\u020c\u020e\u0003"+
		"\u0014\n\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020c\u0001\u0000"+
		"\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0005\u0004"+
		"\u0000\u0000\u0210\u0216\u0001\u0000\u0000\u0000\u0211\u0212\u00057\u0000"+
		"\u0000\u0212\u0216\u0006\u001d\uffff\uffff\u0000\u0213\u0214\u00058\u0000"+
		"\u0000\u0214\u0216\u0006\u001d\uffff\uffff\u0000\u0215\u0207\u0001\u0000"+
		"\u0000\u0000\u0215\u0211\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000"+
		"\u0000\u0000\u0216;\u0001\u0000\u0000\u00008ACLWYpuz\u007f\u0083\u0086"+
		"\u0095\u009d\u00a2\u00b3\u00c0\u00d0\u00de\u00eb\u00ed\u00f5\u0103\u010c"+
		"\u0119\u011c\u0129\u012e\u0133\u0140\u0146\u014f\u015b\u0160\u0169\u016b"+
		"\u0174\u017d\u0185\u0189\u0190\u019b\u019f\u01a9\u01b1\u01ba\u01c1\u01c7"+
		"\u01cd\u01d9\u01e2\u01e4\u01f5\u0201\u0207\u020d\u0215";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}