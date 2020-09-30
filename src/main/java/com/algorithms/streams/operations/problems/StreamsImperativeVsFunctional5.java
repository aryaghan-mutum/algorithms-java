package com.algorithms.streams.operations.problems;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamsImperativeVsFunctional5 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("key3", "value3");
        map.put("key1", "value1");
        map.put("key2", "value2");

        List<String> valuesX = sortFileResultsAlphabeticallyImperativeApproach(map);
        List<String> valuesY = sortFileResultsAlphabeticallyDeclarativeApproach(map);
    }


    /**
     * @param filesLookup
     * @return
     */
    public static List<String> sortFileResultsAlphabeticallyImperativeApproach(Map<String, String> filesLookup) {
        final List<String> files = new ArrayList<>(filesLookup.size());
        final List<String> sortedFileNames = new ArrayList<>(filesLookup.size());

        for (final Map.Entry<String, String> keyVal : filesLookup.entrySet()) {
            sortedFileNames.add(keyVal.getKey());
        }
        Collections.sort(sortedFileNames);

        for (final String fileName : sortedFileNames) {
            files.add(filesLookup.get(fileName));
        }
        return files;
    }

    /**
     * @param filesLookup
     * @return
     */
    public static List<String> sortFileResultsAlphabeticallyDeclarativeApproach(Map<String, String> filesLookup) {
        return filesLookup
                .entrySet()
                .stream()
                .sorted(comparing(Map.Entry::getKey))
                .map(Map.Entry::getValue)
                .collect(toList());
    }
}
