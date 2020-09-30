package com.algorithms.streams.operations.problems;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamsImperativeVsFunctional5 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("key3", "value3");
        map.put("key1", "value1");
        map.put("key2", "value2");

        List<String> valuesX = sortAlphabeticallyImperativeApproach(map);
        List<String> valuesY = sortAlphabeticallyDeclarativeApproach(map);
    }


    /**
     * @param filesMap
     * @return
     */
    public static List<String> sortAlphabeticallyImperativeApproach(Map<String, String> filesMap) {
        final List<String> files = new ArrayList<>(filesMap.size());
        final List<String> sortedFileNames = new ArrayList<>(filesMap.size());

        for (final Map.Entry<String, String> keyVal : filesMap.entrySet()) {
            sortedFileNames.add(keyVal.getKey());
        }
        Collections.sort(sortedFileNames);

        for (final String fileName : sortedFileNames) {
            files.add(filesMap.get(fileName));
        }
        return files;
    }

    /**
     * @param filesMap
     * @return
     */
    public static List<String> sortAlphabeticallyDeclarativeApproach(Map<String, String> filesMap) {
        return filesMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())  //can also be written as: sorted(comparing(Map.Entry::getKey))
                .map(Map.Entry::getValue)
                .collect(toList());
    }
}
