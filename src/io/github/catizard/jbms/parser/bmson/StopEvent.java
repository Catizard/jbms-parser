package io.github.catizard.jbms.parser.bmson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)

public class StopEvent  extends BMSONObject {
	public long duration; // as value. Meaning of value depends on Channel.
}
