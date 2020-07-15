/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1
 {
    public String findSimpleGene(String dna)
    {
        String result = " ";
        int start = dna.indexOf("ATG");
        if (start == -1)
        {
            return " ";
        }
        int stop = dna.indexOf("TAA",start+3);
        if (stop == -1)
        {
            return " ";
        }
        result = dna.substring(start,stop+3);
        if ((start-stop) % 3 ==0)
        {
            return result;
        }
        else
        {
            return " ";
        }
    }
    
    public void testSimpleGene()
    {
        String a1 = "ACTGTAATATCAG";
        String a2 = "ACTGTATGCAATAG";
        String a3 = "ATCGTACGTATTGCC";
        String a4 = "CCTATGTACGAATAACT";
        String a5 = "CCATGTACGTAA";
        
        System.out.println("The string is: " +a1+ ". Gene is" +findSimpleGene(a1));
        System.out.println("The string is: " +a2+ ". Gene is" +findSimpleGene(a2));
        System.out.println("The string is: " +a3+ ". Gene is" +findSimpleGene(a3));
        System.out.println("The string is: " +a4+ ". Gene is" +findSimpleGene(a4));
        System.out.println("The string is: " +a5+ ". Gene is" +findSimpleGene(a5));
    }
}
