// $ANTLR 2.7.4: "DeclScanner.g" -> "DeclScanner.java"$

	package org.exist.xquery.parser;
	
	import org.exist.xquery.XPathException;

public interface DeclScannerTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int QNAME = 4;
	int PREDICATE = 5;
	int FLWOR = 6;
	int PARENTHESIZED = 7;
	int ABSOLUTE_SLASH = 8;
	int ABSOLUTE_DSLASH = 9;
	int WILDCARD = 10;
	int PREFIX_WILDCARD = 11;
	int FUNCTION = 12;
	int UNARY_MINUS = 13;
	int UNARY_PLUS = 14;
	int XPOINTER = 15;
	int XPOINTER_ID = 16;
	int VARIABLE_REF = 17;
	int VARIABLE_BINDING = 18;
	int ELEMENT = 19;
	int ATTRIBUTE = 20;
	int ATTRIBUTE_CONTENT = 21;
	int TEXT = 22;
	int VERSION_DECL = 23;
	int NAMESPACE_DECL = 24;
	int DEF_NAMESPACE_DECL = 25;
	int DEF_COLLATION_DECL = 26;
	int DEF_FUNCTION_NS_DECL = 27;
	int GLOBAL_VAR = 28;
	int FUNCTION_DECL = 29;
	int PROLOG = 30;
	int OPTION = 31;
	int ATOMIC_TYPE = 32;
	int MODULE = 33;
	int ORDER_BY = 34;
	int POSITIONAL_VAR = 35;
	int BEFORE = 36;
	int AFTER = 37;
	int MODULE_DECL = 38;
	int MODULE_IMPORT = 39;
	int SCHEMA_IMPORT = 40;
	int ATTRIBUTE_TEST = 41;
	int COMP_ELEM_CONSTRUCTOR = 42;
	int COMP_ATTR_CONSTRUCTOR = 43;
	int COMP_TEXT_CONSTRUCTOR = 44;
	int COMP_COMMENT_CONSTRUCTOR = 45;
	int COMP_PI_CONSTRUCTOR = 46;
	int COMP_NS_CONSTRUCTOR = 47;
	int COMP_DOC_CONSTRUCTOR = 48;
	int PRAGMA = 49;
	int LITERAL_xpointer = 50;
	int LPAREN = 51;
	int RPAREN = 52;
	int NCNAME = 53;
	int LITERAL_xquery = 54;
	int LITERAL_version = 55;
	int SEMICOLON = 56;
	int LITERAL_module = 57;
	int LITERAL_namespace = 58;
	int EQ = 59;
	int STRING_LITERAL = 60;
	int LITERAL_declare = 61;
	int LITERAL_default = 62;
	// "boundary-space" = 63
	int LITERAL_ordering = 64;
	int LITERAL_construction = 65;
	// "base-uri" = 66
	// "copy-namespaces" = 67
	int LITERAL_option = 68;
	int LITERAL_function = 69;
	int LITERAL_variable = 70;
	int LITERAL_import = 71;
	int LITERAL_encoding = 72;
	int LITERAL_collation = 73;
	int LITERAL_element = 74;
	int LITERAL_order = 75;
	int LITERAL_empty = 76;
	int LITERAL_greatest = 77;
	int LITERAL_least = 78;
	int LITERAL_preserve = 79;
	int LITERAL_strip = 80;
	int LITERAL_ordered = 81;
	int LITERAL_unordered = 82;
	int COMMA = 83;
	// "no-preserve" = 84
	int LITERAL_inherit = 85;
	// "no-inherit" = 86
	int DOLLAR = 87;
	int LCURLY = 88;
	int RCURLY = 89;
	int COLON = 90;
	int LITERAL_external = 91;
	int LITERAL_at = 92;
	int LITERAL_schema = 93;
	int LITERAL_as = 94;
	// "empty-sequence" = 95
	int QUESTION = 96;
	int STAR = 97;
	int PLUS = 98;
	int LITERAL_item = 99;
	int LITERAL_for = 100;
	int LITERAL_let = 101;
	int LITERAL_some = 102;
	int LITERAL_every = 103;
	int LITERAL_if = 104;
	int LITERAL_typeswitch = 105;
	int LITERAL_update = 106;
	int LITERAL_replace = 107;
	int LITERAL_value = 108;
	int LITERAL_insert = 109;
	int LITERAL_delete = 110;
	int LITERAL_rename = 111;
	int LITERAL_with = 112;
	int LITERAL_into = 113;
	int LITERAL_preceding = 114;
	int LITERAL_following = 115;
	int LITERAL_where = 116;
	int LITERAL_return = 117;
	int LITERAL_in = 118;
	int LITERAL_by = 119;
	int LITERAL_ascending = 120;
	int LITERAL_descending = 121;
	int LITERAL_satisfies = 122;
	int LITERAL_case = 123;
	int LITERAL_then = 124;
	int LITERAL_else = 125;
	int LITERAL_or = 126;
	int LITERAL_and = 127;
	int LITERAL_instance = 128;
	int LITERAL_of = 129;
	int LITERAL_treat = 130;
	int LITERAL_castable = 131;
	int LITERAL_cast = 132;
	int LT = 133;
	int GT = 134;
	int LITERAL_eq = 135;
	int LITERAL_ne = 136;
	int LITERAL_lt = 137;
	int LITERAL_le = 138;
	int LITERAL_gt = 139;
	int LITERAL_ge = 140;
	int NEQ = 141;
	int GTEQ = 142;
	int LTEQ = 143;
	int LITERAL_is = 144;
	int LITERAL_isnot = 145;
	int ANDEQ = 146;
	int OREQ = 147;
	int LITERAL_to = 148;
	int MINUS = 149;
	int LITERAL_div = 150;
	int LITERAL_idiv = 151;
	int LITERAL_mod = 152;
	int PRAGMA_START = 153;
	int PRAGMA_END = 154;
	int LITERAL_union = 155;
	int UNION = 156;
	int LITERAL_intersect = 157;
	int LITERAL_except = 158;
	int SLASH = 159;
	int DSLASH = 160;
	int LITERAL_text = 161;
	int LITERAL_node = 162;
	int LITERAL_attribute = 163;
	int LITERAL_comment = 164;
	// "processing-instruction" = 165
	// "document-node" = 166
	int LITERAL_document = 167;
	int SELF = 168;
	int XML_COMMENT = 169;
	int XML_PI = 170;
	int LPPAREN = 171;
	int RPPAREN = 172;
	int AT = 173;
	int PARENT = 174;
	int LITERAL_child = 175;
	int LITERAL_self = 176;
	int LITERAL_descendant = 177;
	// "descendant-or-self" = 178
	// "following-sibling" = 179
	int LITERAL_parent = 180;
	int LITERAL_ancestor = 181;
	// "ancestor-or-self" = 182
	// "preceding-sibling" = 183
	int DOUBLE_LITERAL = 184;
	int DECIMAL_LITERAL = 185;
	int INTEGER_LITERAL = 186;
	int END_TAG_START = 187;
	int QUOT = 188;
	int APOS = 189;
	int QUOT_ATTRIBUTE_CONTENT = 190;
	int ESCAPE_QUOT = 191;
	int APOS_ATTRIBUTE_CONTENT = 192;
	int ESCAPE_APOS = 193;
	int ELEMENT_CONTENT = 194;
	int XML_COMMENT_END = 195;
	int XML_PI_END = 196;
	int XML_CDATA = 197;
	int LITERAL_collection = 198;
	int LITERAL_validate = 199;
	int XML_PI_START = 200;
	int XML_CDATA_START = 201;
	int XML_CDATA_END = 202;
	int LETTER = 203;
	int DIGITS = 204;
	int HEX_DIGITS = 205;
	int NMSTART = 206;
	int NMCHAR = 207;
	int WS = 208;
	int EXPR_COMMENT = 209;
	int PREDEFINED_ENTITY_REF = 210;
	int CHAR_REF = 211;
	int S = 212;
	int NEXT_TOKEN = 213;
	int CHAR = 214;
	int BASECHAR = 215;
	int IDEOGRAPHIC = 216;
	int COMBINING_CHAR = 217;
	int DIGIT = 218;
	int EXTENDER = 219;
}
