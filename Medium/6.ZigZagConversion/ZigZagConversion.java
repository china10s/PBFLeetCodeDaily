public class ZigZagConversion{
	public static String ZigZagConversion(String s,int numRows){
		StringBuilder sb=new StringBuilder("");
		int numCount = (numRows+numRows/2);
		int maxCols = (s.length()/numCount)*2;
		int maxCol = s.length()%(numCount)<=numRows?maxCols+1:maxCols+2;
		int maxColRow = s.length()%(numCount)<=numRows?s.length()%(numCount):(s.length()%(numCount)-numCount)*2;
		System.out.println("maxCol:"+maxCol);
		System.out.println("maxColRow:"+maxColRow);
		for (int iRow=0;iRow<numRows;++iRow){
			for (int iCol=0;iCol<maxCol;++iCol){
				int colCount = (iCol/2)*numCount;
				if (iRow >= maxColRow && iCol >= maxCol-1){
					return sb.toString();
				}
				else{
					if ((iCol%2) == 0){
						char ch = s.charAt(colCount+iRow);
						sb.insert(sb.length(),ch);
					}
					else{
						if(iRow%2==1){
							char ch = s.charAt(colCount+numRows+(iRow-1)/2);
							sb.insert(sb.length(),ch);
						}
					}
				}
			}
		}
		return sb.toString();
	}
	public static void main(String[] args){
		System.out.println(ZigZagConversion("PAYPALISHIRING",3));
	}
}