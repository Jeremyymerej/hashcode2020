package hashcode2020.Parser

class FileContent {

    String fileContent
    List<String> contentLines
    List<List<String>> detailedLines
    List<Map<Integer, String>> indexedLines

    FileContent(String fileContent){
        this.fileContent = fileContent
        this.contentLines = fileContent.split('\n').collect()
        this.detailedLines = contentLines.collect{
            it.split(' ')
        }
        this.indexedLines = contentLines.collect {
            it.split(' ').collect().indexed()
        } as List<Map<Integer, String>>
    }

    List<String> first() {
        return detailedLines.first()
    }

    List<String> second() {
        return detailedLines.get(1)
    }

    List<String> rest() {
        return detailedLines.subList(1, detailedLines.size())
    }

    List<String> fullContent() {
        return detailedLines;
    }

    static FileContent extractContentFromFile(String path){
        String fileContent = FileReader.readFile(path)
        new FileContent(fileContent)
    }

}
