package com.hw212.stringliststringlist.controllers;

import com.hw212.stringliststringlist.interfaces.StringList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/StringList")
public class StringListController {
    StringList stringList;
@Autowired
    public StringListController(StringList stringList) {
        this.stringList = stringList;
    }
    @GetMapping()
    public String add(@RequestParam String item) {
        return stringList.add(item);
    }

    @GetMapping()
    public String add(@RequestParam int index, @RequestParam String item) {
        return stringList.add(index, item);
    }
    @GetMapping()
    public String set(@RequestParam int index, @RequestParam String item) {
        return stringList.set(index, item);
    }
    @GetMapping()
    public String remove(@RequestParam String item) {
        return stringList.remove(item);
    }
    @GetMapping()
    public String remove(@RequestParam int index) {
        return stringList.remove(index);
    }
    @GetMapping()
    public boolean contains(@RequestParam String index) {
        return stringList.contains(index);
    }
    @GetMapping()
    public int indexOF(@RequestParam String item) {
        return stringList.indexOF(item);
    }
    @GetMapping()
    public int lastIndexOF(@RequestParam String item) {
        return stringList.lastIndexOF(item);
    }
    @GetMapping()
    public String get(@RequestParam int index) {
        return stringList.get(index);
    }
    @GetMapping()
    public boolean equals(@RequestParam StringList otherList) {
        return stringList.equals(otherList);
    }
    @GetMapping()
    public boolean isEmpty() {
        return stringList.isEmpty();
    }
    @GetMapping()
    public void clear() {
        stringList.clear();
    }
    @GetMapping()
    public String[] toArray() {
        return stringList.toArray();
    }
}
