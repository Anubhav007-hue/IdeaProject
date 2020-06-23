public class LicenseKetFormetting {
    public static void main(String[] args )
    {
        String str="---";
        System.out.print(licenseKeyFormatting(str,3));

    }

    public  static String licenseKeyFormatting(String S, int K) {
      int index =S.length()-1;
      StringBuilder sb=new StringBuilder();
      int temp=K;

      while(index>=0)
      {
          while(index>=0 && temp>0)
          {
              if(S.charAt(index)!='-'){
                  sb.insert(0,Character.toUpperCase(S.charAt(index)));
                  temp--;
              }
              index--;
          }
         if(index>=0) sb.insert(0,"-");
          temp=K;
      }

      if( sb.length()!=0 && sb.charAt(0)=='-')
      {
           return sb.substring(1).toString();
      }

        return sb.toString();
    }
}
