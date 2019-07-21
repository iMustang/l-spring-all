package com.xmustang.collectioninject;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


@Setter
@Getter
public class JavaCollection {
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
}
