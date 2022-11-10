package ch7;


public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParseManager.getParser("XML"); //XMLParser이 대입 자동형변환을 통해
		parser.parse("document.xml");
		parser = ParseManager.getParser("HTML"); // HTMLParser이 대입 자동형변환을 통해
		parser.parse("document2.html");
	}
}


interface Parseable{
	//구문 분석작업을 수행한다.
	public abstract void parse(String fileName);
}

class ParseManager{
	//리턴타입이 Parsable인 메서드
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName+"- XML parsing completed.");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName+"- HTML parsing completed.");
	}
}