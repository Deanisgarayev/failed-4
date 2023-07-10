package com.hw212.stringliststringlist.interfaces;

import org.springframework.stereotype.Service;

@Service
public interface StringList {
    String add(String item);
    String add(int index, String item);
    String set(int index, String item);
    String remove(String item);
    String remove(int index);
    boolean contains(String index);
    int indexOF(String item);
    int lastIndexOF(String item);
    String get(int index);
    boolean equals(StringList otherList);
    boolean isEmpty();
    void clear();
    String[] toArray();
}
