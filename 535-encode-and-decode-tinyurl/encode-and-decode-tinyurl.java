public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String a=new String();
        for(int i=0;i<longUrl.length();i++){
            char c=longUrl.charAt(i);
                a+=(char)(c+1);
        //        System.out.println(a);
        }
        System.out.println(a);
        return a;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
      String ab=new String();
        for(int i=0;i<shortUrl.length();i++){
                char c=shortUrl.charAt(i);
                ab+=(char)(c-1);
        }
        return ab;
    }
    }


// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));