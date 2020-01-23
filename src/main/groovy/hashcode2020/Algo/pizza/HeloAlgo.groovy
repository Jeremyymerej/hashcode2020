package hashcode2020.Algo.pizza


import hashcode2020.Parser.FileContent

class HeloAlgo {
    static List<String> apply(FileContent fileContent) {
        List<String> infoLines = fileContent.first()
        List<String> slicesLines = fileContent.second()
        int maxParticipants = infoLines.get(0).toInteger()
        int maxNumberOfPizzas = infoLines.get(1).toInteger()

        int currentScore = 0
        List<String> answers = []
        int previousScore = 0

        for(int index = maxNumberOfPizzas - 1; index > 0; index--) {
            currentScore += slicesLines.get(index).toInteger()
            if(currentScore > maxParticipants){ // Does not take slices
                currentScore = previousScore
            } else { // Take slices
                previousScore = currentScore
                answers.add(index.toString())
            }
        }
        return answers
    }
}
