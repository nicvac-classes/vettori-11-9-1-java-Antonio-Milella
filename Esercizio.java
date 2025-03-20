//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        //Variabili del programma
        String iFn, oFn, riga;

        //Creo l'oggetto in per l'input da tastiera

        File FR = new File (iFn);
        File FW = new File (oFn);
        
        Scanner in = new Scanner( System.in );
        Scanner inFile = new Scanner(new FileReader(FR));
        Scanner outFile = new Scanner(new FileWriter(FW));

        //Leggo l'input da tastiera
        System.out.println("Inserisci nome del file di input: ");
        iFn = in.nextLine();
        System.out.println("Inserisci nome del file di output: ");
        oFn = in.nextLine();
        
        do{
            riga = inFile.nextLine();
            riga = inverti(riga);
            inFile.close();
            scriviFile(riga,iFn);
        }while(inFile.hasNextLine());
        in.close();
    }

    public static String inverti(String riga){
        int n, i;
        String agir;

        n = riga.length();
        agir = "";
        for (i = n-1; i>=0; i--){
            agir = agir + riga.charAt(i);
        }    
        return agir;
    }

    public static void scriviFile(String riga, String nomeFile) {
        outFile.write(System.lineSeparator(riga));
        outFile.close();
    }
    
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md