package com.nio;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class wcMain{
	public static void main(String[] args) {
		BufferedReader br = null;
        String sCurrentLine = null;
        String content="";
        try
        {
            br = new BufferedReader(new FileReader("D:/javaWorkspace/path.JSON"));
            while ((sCurrentLine = br.readLine()) != null)
             content = content.concat(sCurrentLine)+"\n";
        }
        catch (IOException e){ 
            e.printStackTrace();
        }
        finally{
            try{
                if (br != null)
                br.close();
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
        WC wcObject = new WC(content);
        System.out.println(wcObject);
	}
}
