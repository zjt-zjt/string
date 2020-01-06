package com.lanou;

public class main {

	public static void main(String[] args) {
//		String str = "abc";
//        String str1 = "abc"+"cdf";
//        //常量区
//        String str2 = "123";
//        
//        //堆区储存
//        String string = new String("123");
//        String string2 = new String("123");
//        
        
//        String str3 = "abcdaefg";
//        String str4 = str3.concat("defghj");
//        System.out.println(str4);
//        
//        String string = str4.substring(3);
////        System.out.println(string);
//        String string2 =string.substring(2, 5);
////        System.out.println(string2);
//        String string3 = string2.toLowerCase() ;    
//        int index = str3.indexOf('c');
//        System.out.println(index);
//        int index1 = str3.indexOf('b',9 );
//        System.out.println(index1);
//        int index2 = str3.indexOf("a");
//        int index2 = str3.indexOf("fg", 4);
//        System.out.println(index2);
//        int index2 = str3.lastIndexOf("a");
//        System.out.println(index2);
        
//        String str = "abc";
//        String str1 = "abcefg";
////      Boolean boolean1 = str.equalsIgnoreCase(str1);
//        Boolean boolean2 = str1.startsWith("a");
//        Boolean boolean3 = str1.endsWith("fg");
//        String str5 = "";
//        System.out.println(boolean3);
//        System.out.println(str5.isEmpty());
//        String string = "zxcvbnm";
//     System.out.println(string.length());
//        char char1 = string.charAt(2);
//        System.out.println(char1);
//       
//        char[] char3 = {'a','b','c'};
//        
//        
//        
//        String string1 = "zxcvbncm";
//        char[] char2 = string1.toCharArray();
//        System.out.println(char2[2]);
//        
//        String str = string1.replace('c', 'a');
//        System.out.println(str);
//        
//        String str1 = string1.replace("zxc", "aaa");
//        System.out.println(str1);
//        
//        StringBuilder stringBuilder = new StringBuilder("abc");
//         StringBuilder  a = stringBuilder.append('d');
//         System.out.println(a);
//        
        
//        String string  = "好好学习，天天向上";
//		StringBuffer  stringBuffer = new StringBuffer(string);
//		System.out.println(stringBuffer.substring(0, 4));
//		System.out.println(stringBuffer.delete(0, 1));
//		System.out.println(stringBuffer.deleteCharAt(4));
//		System.out.println(stringBuffer.insert(4, '天'));
//		String string2 = stringBuffer.toString();
//		System.out.println(string2);
		
		
//		String string ="好好学习，天天向上";
//		String[] string1 = string.split(",");
//		System.out.println(string.length());
//		for (String string2 : string1) {
//			System.out.println(string2);
//		}
		
		
//		String str5 = "replaces the first";
//		String[] string1 = str5.split(" ");
//		StringBuilder stringBuilder = new StringBuilder();
//		for (String string : string1) {
//			stringBuilder.append(string.substring(0, 1).toUpperCase());
//			stringBuilder.append(string.substring(1));
//			stringBuilder.append(" ");
//		}
//		System.out.println(stringBuilder);
		
		
		
		
		String str5 = "replaces the first";
		String[] string1 = str5.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		for (String string : string1) {
			String firstLetter = string.substring(0, 1);
			String firstLetterUpper = firstLetter.toUpperCase();
			String otherLotter = string.substring(1);
			String newLotter = firstLetterUpper.concat(otherLotter);
			stringBuilder.append(newLotter+" ");
		}
		System.out.println(stringBuilder);
		
		
		
	}

}
