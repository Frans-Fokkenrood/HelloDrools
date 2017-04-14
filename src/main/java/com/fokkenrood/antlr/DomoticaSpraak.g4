grammar DomoticaSpraak;

statements
	:
	(	regel
	|	testcase
	)+
	;

regel
	:
	(	RREGEL rg=TEKST IN rs=TEKST LUIDT DUBBELE_PUNT
		ZZET DE LAMP ( s=AAN | s=UIT )
		INDIEN AAN DE VOLGENDE VOORWAARDEN WORDT VOLDAAN DUBBELE_PUNT
		(	object[$rg.text]
		)+
		PUNT
	)
	;
	
object[String rg]
	:
	(	STREEPJE DE obj=AUTOMAAT HEEFT RUBRIEK
		(	voorwaarde[rg]
		)+	
	)
	;
	
voorwaarde[String rg]	
	:
	(	eo=EN RUBRIEK
	|	eo=OF RUBRIEK
	)?
	(	f1=feit v=vergelijking w1=waarde
	|	f2=feit BEVAT w2=waarde
	)
	;
	
testcase
	:
	(	TTESTCASE tc=TEKST IN rs=TEKST OMVAT DE VOLGENDE TESTGEVALLEN DUBBELE_PUNT
		(	testgeval
		)+
		PUNT
	)
	;

testgeval
	:
	(	STREEPJE tg=TEKST MET ALS INVOER DUBBELE_PUNT
		(	invoer
		)+
		WAARDOOR DE REGEL ( not=NIET )? ZAL VUREN
	)
	;

invoer
	:
	(	EEN
		(	obj=AUTOMAAT
		)
		(	toekennen[$obj.text]
		)+
	)
	;
	
toekennen[String obj]
	:
	(	WAARBIJ f=feit WORDT GESTELD OP w=waarde
	)
	;

waarde returns [String value]
	:
	(	WOORD										{ $value = $WOORD.text; }
	|	TEKST										{ $value = "\"" + $TEKST.text + "\""; }
	|	GETAL										{ $value = $GETAL.text; }
	|	GETAL_NUL									{ $value = "0"; }
	|	NEE											{ $value = "false"; }
	|	JA											{ $value = "true"; }
	)
	;

vergelijking returns [String operator]
	:	
	(	IS GELIJK AAN								{ $operator = "=="; }
	|	IS NIET GELIJK AAN							{ $operator = "!="; }
	|	IS HOGER OF GELIJK AAN						{ $operator = ">="; }
	|	IS HOGER DAN								{ $operator = ">";  }
	|	IS LAGER OF GELIJK AAN						{ $operator = "<="; }
	|	IS LAGER DAN								{ $operator = "<";  }
	)
	;

feit returns [String signifier]
	:
	(	WOORD										{ $signifier  = $WOORD.text; }
		(	WOORD									{ $signifier += (" " + $WOORD.text); }
		)*
	) 
	;


BLOCKCOMMENT:			'/*' .*? '*/'					-> skip ;
LINECOMMENT:			'//' .*? '\r\n'					-> skip ;

fragment QUOTE:			'"' ;
fragment KOMMA:			',' ;
fragment LETTER:		[a-zA-Z] ;
fragment CIJFER:		[0-9] ;

TEKST:					QUOTE .*? QUOTE					{ setText(getText().replaceAll("\"","")); } ;

AAN:					'aan' ;
ALS:					'als' ;
AUTOMAAT:				'automaat' ;
BEVAT:					'bevat' ;
DAN:					'dan' ;
DE:						'de' ;
EEN:					'een' ;
EN:						'en' ;
GELIJK:					'gelijk' ;
GESTELD:				'gesteld' ;
HEEFT:					'heeft' ;
HOGER:					'hoger' ;
INDIEN:					'indien' ;
INVOER:					'invoer' ;
IN:						'in' ;
IS:						'is' ;
JA:						'ja' ;
LAGER:					'lager' ;
LAMP:					'lamp' ;
LUIDT:					'luidt' ;
MET:					'met' ;
NEE:					'nee' ;
NIET:					'niet' ;
OMVAT:					'omvat' ;
OF:						'of' ;
OP:						'op' ;
RREGEL:					'Regel' ;
REGEL:					'regel' ;
RUBRIEK:				'rubriek' ;
TTESTCASE:				'Testcase' ;
TESTGEVALLEN:			'testgevallen' ;
UIT:					'uit' ;
VAN:					'van' ;
VOLDAAN:				'voldaan' ;
VOLGENDE:				'volgende' ;
VOORWAARDEN:			'voorwaarden' ;
VUREN:					'vuren' ;
WAARBIJ:				'waarbij' ;
WAARDOOR:				'waardoor' ;
WORDT:					'wordt' ;
ZAL:					'zal' ;
ZZET:					'Zet' ;




DUBBELE_PUNT:			':' ;
GETAL_NUL:				'0' ;
PUNT:					'.' ;
STREEPJE:				'-' ;

GETAL:					( STREEPJE )? CIJFER+ ;
WOORD:					LETTER ( LETTER | STREEPJE )* ;

WS:						[ \t\r\n]+						-> skip ;
