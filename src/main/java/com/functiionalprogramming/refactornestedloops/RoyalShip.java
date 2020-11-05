package com.functiionalprogramming.refactornestedloops;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@Data
@NoArgsConstructor
@AllArgsConstructor
class RoyalShip {
    
    private String shipName;
    private List<Menus> menusList;
    
    public Stream<Menus> getMenus() {
        return menusList.stream();
    }
    
    public List<Menus> getMenusList() {
        return Collections.unmodifiableList(menusList);
    }
    
}
    


