public class AnalysisReport {
    private int score;
    private String strengthLevel, recommendations, detectedIssues;

    //Constructor
    public AnalysisReport(int score, String strengthLevel, String recommendations, String detectedIssues){
        this.score = score;
        this.strengthLevel = strengthLevel;
        this.recommendations = recommendations;
        this.detectedIssues = detectedIssues;
    }


    //Getter methods
    public int getScore(){
        return score;
    }

    public String getStrengthLevel(){
        return strengthLevel;
    }

    public String getRecommendations(){
        return recommendations;
    }

    public String getDEtectedIssues(){
        return detectedIssues;
    }


    //toString method to display the results
    /* @Override
    public String toString() {
        
    } */
}
