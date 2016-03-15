
package com.kendoui.taglib.diagram;


import com.kendoui.taglib.BaseTag;




import java.util.ArrayList;
import java.util.Map;
import java.util.List;

import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class ShapeDefaultsConnectorsTag extends BaseTag /* interfaces */ /* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag
//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize

        connectors = new ArrayList<Map<String, Object>>();

//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    private List<Map<String, Object>> connectors;

    public List<Map<String, Object>> connectors() {
        return connectors;
    }

    public static String tagName() {
        return "diagram-shapeDefaults-connectors";
    }

    public void addConnector(ShapeDefaultsConnectorTag value) {
        connectors.add(value.properties());
    }

//<< Attributes

}