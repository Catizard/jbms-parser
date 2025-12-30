package io.github.catizard.jbms.parser.bmson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)

public class BGAHeader {
	public int id;
	public String name;
}
