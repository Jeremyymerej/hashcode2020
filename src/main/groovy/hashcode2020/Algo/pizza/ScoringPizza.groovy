package hashcode2020.Algo.pizza


import hashcode2020.Parser.FileContent

class ScoringPizza  {
    static int computeScore(FileContent inputFileContent, List<String> slices){
        List<String> sliceLine = inputFileContent.second()
        int score = 0;
        slices.each {
            score += sliceLine.get(it.toInteger()).toInteger()
        }
        score
    }
}
