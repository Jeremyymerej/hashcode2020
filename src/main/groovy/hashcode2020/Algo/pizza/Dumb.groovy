package hashcode2020.Algo.pizza


import hashcode2020.Parser.FileContent

class Dumb {

    static List<String> apply(FileContent fileContent) {
        List<String> infoLines = fileContent.first()
        List<String> slicesLines = fileContent.second()
        int maxParticipants = infoLines.get(0).toInteger()
        int maxNumberOfPizzas = infoLines.get(1).toInteger()

        int currentScore = 0
        List<String> answers = []
        for(int i = 0; i < maxNumberOfPizzas; i++) {
            currentScore += slicesLines.get(i).toInteger()
            if(currentScore > maxParticipants) {
                break
            }
            answers.add(i.toString())
        }
        return answers
    }
}
