package hashcode2020.Parser

class FileWriter {
    static void writeOutputFile(String content, String outputFilePath) {
        File file = new File(outputFilePath)
        file.write(content.toString())
    }

    static String outputPathOf(String inputFilePath) {
        return inputFilePath.replace('input','output').replace('.in', '.out')
    }

    static String formatPizzaAnswer(List<String> answers) {
        "${answers.size()}\n${answers.join(" ")}\n"
    }
}
