public class Question7 
{
    public static void main(String[] args) 
    {
       String s1;
       String s2;
       s1 = "Kumarjit";
       s2 = " Mongal";

       System.out.print("\n\n\nString Class PreDefined Methods...............................>\n");
       System.out.print("\ns1 string is looks like : "+s1+"\n");
       System.out.print("\ns2 string is looks like : "+s2+"\n");
       System.out.print("\nAfter Calling s1.length() method : "+s1.length()+"\n");  
       System.out.print("\nAfter calling s1.charAt(3) method : "+s1.charAt(3)+"\n");
       System.out.print("\nAfter calling s1.substring(0,4) method : "+s1.substring(0, 4)+"\n");
       System.out.print("\nAfter calling s1.toLowerCase() method : "+s1.toLowerCase()+"\n");
       System.out.print("\nAfter calling s1.toUpperCase() method : "+s1.toUpperCase()+"\n");
       System.out.print("\nAfter calling s1.isEmpty() method : "+s1.isEmpty()+"\n");
       System.out.print("\nAfter calling s1.compareTo(s2) method : "+s1.compareTo(s2)+"\n");
       System.out.print("\nAfter calling s2.trim() method : "+s2.trim()+"\n");
       System.out.print("\nAfter calling s1.equals(s2) method : "+s1.equals(s2)+"\n");
       System.out.print("\nAfter calling s2.contains(\"k\") method : "+s2.contains("k")+"\n");


       StringBuffer ss1 = new StringBuffer();
       System.out.print("\n\n\nStringBuffer Class PreDefined Methods...............................>\n");
       System.out.print("\nAfter calling ss1.append(s1) method : "+ss1.append(s1)+"\n");
       System.out.print("\nAfter calling ss1.capacity() method : "+ss1.capacity()+"\n");
       System.out.print("\nAfter calling ss1.indeOf(\"j\") method : "+ss1.indexOf("j")+"\n");
       System.out.print("\nAfter calling ss1.delete(0,5) method : "+ss1.delete(0, 5)+"\n");
       System.out.print("\nAfter calling ss1.insert(0,\"Kumar\") method : "+ss1.insert(0, "Kumar")+"\n\n\n");
       
    }    
}
