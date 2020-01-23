package hashcode2020.Algo.pizza

import hashcode2020.Parser.FileContent

class RandomPizza {

    static Random random = new Random()

    static List<String> apply(FileContent fileContent) {
        List<String> infoLines = fileContent.first()
        List<String> slicesLine = fileContent.second()
        int maxParticipants = infoLines.get(0).toInteger()
        int maxNumberOfPizzas = infoLines.get(1).toInteger()
        List<Integer> alreadyTakenPizzasIndex = []
        int currentScore = 0
        List<String> answers = []

        while(true) {
            int randomchosenIndex =  Math.abs(random.nextInt() % [maxNumberOfPizzas] as int)
            while (alreadyTakenPizzasIndex.contains(randomchosenIndex)) {
                randomchosenIndex =  Math.abs(random.nextInt() % [maxNumberOfPizzas] as int)
            }

            int currentSlices = slicesLine.get(randomchosenIndex).toInteger()
            if(currentScore + currentSlices > maxParticipants){ // Do not take slices
                break
            } else { // Take slices
                currentScore += currentSlices
                alreadyTakenPizzasIndex.add(randomchosenIndex)
                answers.add(randomchosenIndex.toString())
            }
        }
        return answers
    }
}
