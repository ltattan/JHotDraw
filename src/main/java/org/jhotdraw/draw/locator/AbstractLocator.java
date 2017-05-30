/*
 * @(#)AbstractLocator.java
 *
 * Copyright (c) 1996-2010 by the original authors of JHotDraw
 * and all its contributors.
 * All rights reserved.
 *
 * The copyright of this software is owned by the authors and  
 * contributors of the JHotDraw project ("the copyright holders").  
 * You may not use, copy or modify this software, except in  
 * accordance with the license agreement you entered into with  
 * the copyright holders. For details see accompanying license terms. 
 */

package org.jhotdraw.draw.locator;

import org.jhotdraw.draw.*;
import java.awt.geom.*;
import java.io.Serializable;
import org.jhotdraw.xml.*;
/**
 * This abstract class can be extended to implement a {@link Locator}.
 *
 * @author Werner Randelshofer
 * @version $Id: AbstractLocator.java 647 2010-01-24 22:52:59Z rawcoder $
 */
public abstract class AbstractLocator implements Locator, DOMStorable, Serializable {
    
    /** Creates a new instance. */
    public AbstractLocator() {
    }
    
    @Override
    public Point2D.Double locate(Figure owner, Figure dependent) {
        return locate(owner);
    }
    
    
}
