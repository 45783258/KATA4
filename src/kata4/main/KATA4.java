package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;


public class KATA4 {
    public static void main(String[] args) throws IOException{
        KATA4 histo= new KATA4();
        histo.execute();
    }
    
    private String filename;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private static HistogramDisplay histoDisplay;
    
    private void execute() throws IOException{
        input();
        process();
        output();
        
    }
    
    private void input() throws IOException{
        filename="C:\\Users\\DaniCerv\\Desktop\\KATA4\\emails.txt";
        mailList= MailListReader.read(filename);
    }
    
    private void process(){
        histogram=MailHistogramBuilder.build(mailList);
    }
    private void output(){
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
