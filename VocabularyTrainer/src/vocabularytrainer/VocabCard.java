/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabularytrainer;

/**
 *
 * @author jan
 */
public class VocabCard {
    
    String lang1;
    String lang2;
    
    public VocabCard(String lang1, String lang2) {
        this.lang1=lang1;
        this.lang2=lang2;
    }
    
    public String getLang1() {
        return lang1;
    }
    
    public String getLang2() {
        return lang2;
    }
}
