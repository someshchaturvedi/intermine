package org.intermine.web;

/*
 * Copyright (C) 2002-2005 FlyMine
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  See the LICENSE file for more
 * information or http://www.gnu.org/copyleft/lesser.html.
 *
 */

/**
 * Container for ServletContext and Session attribute names used by the webapp
 *
 * @author Kim Rutherford
 */
public interface Constants
{
    /**
     * ServletContext attribute used to store web.properties
     */
    public static final String WEB_PROPERTIES = "WEB_PROPERTIES";

    /**
     * ServletContext attribute used to store the example queries
     */
    public static final String EXAMPLE_QUERIES = "EXAMPLE_QUERIES";
    
    /**
     * ServletContext attribute used to store global template queries
     */
    public static final String GLOBAL_TEMPLATE_QUERIES = "GLOBAL_TEMPLATE_QUERIES";
    
    /**
     * ServletContext attribute maps category name to List of TemplateQuerys
     */
    public static final String CATEGORY_TEMPLATES = "CATEGORY_TEMPLATES";
    
    /**
     * ServletContext attribute maps a class name to a Map of category names to List of
     * TemplateQuerys.
     */
    public static final String CLASS_CATEGORY_TEMPLATES = "CLASS_CATEGORY_TEMPLATES";

    /**
     * ServletContext attribute - global instance of TemplateRepository.
     */
    public static final String TEMPLATE_REPOSITORY = "TEMPLATE_REPOSITORY";
    
    /**
     * ServletContext attribute maps a class name to a Map of template names to simple expressions -
     * the expression describes a field that should be set when a template is linked to from the
     * object details page.  eg. Gene.identifier
     */
    public static final String CLASS_TEMPLATE_EXPRS = "CLASS_TEMPLATE_EXPRS";
    
    /**
     * ServletContext attribute maps category name to List of class names.
     */
    //public static final String CATEGORY_CLASSES = "CATEGORY_CLASSES";
    
    /**
     * ServletContext attribute, List of category names.
     */
    public static final String CATEGORIES = "CATEGORIES";
    
    /**
     * ServletContext attribute, Map from unqualified type name to list of subclass names.
     */
    public static final String SUBCLASSES = "SUBCLASSES";
    
    /**
     * ServletContext attribute, provides an interface for actions and
     * controllers to query some model meta-data like class counts and
     * field enumerations.
     */
    public static final String OBJECT_STORE_SUMMARY = "OBJECT_STORE_SUMMARY";

    /**
     * ServletContext attribute used to store the WebConfig object for the Model.
     */
    public static final String WEBCONFIG = "WEBCONFIG";

    /**
     * ServletContext attribute used to store the ObjectStore
     */
    public static final String OBJECTSTORE = "OBJECTSTORE";

    /**
     * ServletContext attribute used to store the ProfileManager
     */
    public static final String PROFILE_MANAGER = "PROFILE_MANAGER";
    
    /**
     * Session attribute used to store the user's Profile
     */
    public static final String PROFILE = "PROFILE";
    
    /**
     * Session attribute used to store the current query
     */
    public static final String QUERY = "QUERY";
    
    /**
     * Session attribute used to store the copy of the query that the user is
     * building a template with.
     */
    public static final String TEMPLATE_PATHQUERY = "TEMPLATE_PATHQUERY";
    
    /**
     * Session attribute used to store the original of the template being edited
     * in the query builder.
     */
    public static final String EDITING_TEMPLATE = "EDITING_TEMPLATE";
    
    /**
     * Session attribute set to Boolean.TRUE when query builder is in
     * template building/editing mode.
     */
    public static final String TEMPLATE_MODE = "TEMPLATE_MODE";
    
    /**
     * Session attribute used to store the results of running the current query
     */
    //public static final String QUERY_RESULTS = "QUERY_RESULTS";
    
    /**
     * Session attribute storing a bean exposing the user's trail through the object details
     * pages.
     */
    public static final String OBJECT_DETAILS_TRAIL = "OBJECT_DETAILS_TRAIL";

    /**
     * Servlet context attribute - map from data set name to DataSet object.
     */
    public static final String DATASETS = "DATASETS";
    
    /**
     * Session attribute equals Boolean.TRUE when logged in user is superuser.
     */
    public static final String IS_SUPERUSER = "IS_SUPERUSER";
    
    /**
     * Session attribute containing Map containing 'collapsed' state of objectDetails.jsp
     * UI elements.
     */
    public static final String COLLAPSED = "COLLAPSED";
    
    /**
     * Servlet attribute used to store username of superuser (this attribute
     * will disappear when we implement a more fine-grained user privileges
     * system).
     */
    public static final String SUPERUSER_ACCOUNT = "SUPERUSER_ACCOUNT";
    
    /**
     * Session attribute that temporarily holds a Vector of messages that will be displayed by the
     * errorMessages.jsp on the next page viewed by the user and then removed (allows message
     * after redirect).
     */
    public static final String MESSAGES = "MESSAGES";
    
    /**
     * Session attribute that temporarily holds a Vector of errors that will be displayed by the
     * errorMessages.jsp on the next page viewed by the user and then removed (allows errors
     * after redirect).
     */
    public static final String ERRORS = "ERRORS";

    /**
     * The name of the property that is set to TRUE in the PortalQueryAction Action to indicate
     * to the ObjectDetailsController that we have come from a portal page.
     */
    public static final String PORTAL_QUERY_FLAG = "PORTAL_QUERY_FLAG";

    /**
     * The name of the property to look up to find the maximum size of an inline table.
     */
    public static final String INLINE_TABLE_SIZE = "inline.table.size";
    
    /**
     * Servlet context attribute that is a reference to a lucene Directory object containing
     * the template query index.
     */
    public static final String TEMPLATE_INDEX_DIR = "TEMPLATE_INDEX_DIR";
    
    /**
     * Period of time to wait for client to poll a running query before cancelling the query.
     */
    public static final int QUERY_TIMEOUT_SECONDS = 20;
    
    /**
     * Refresh period specified on query poll page.
     */
    public static final int POLL_REFRESH_SECONDS = 2;

    /**
     * The session attribute that holds the DisplayObjectCache object for the session.
     */
    public static final String DISPLAY_OBJECT_CACHE = "DISPLAY_OBJECT_CACHE";

    /**
     * Session attribute that holds cache of table identifiers to PagedTable objects.
     */
    public static final String TABLE_MAP = "TABLE_MAP";

    /**
     * Session attribute that holds a map from class name to map from field name to Boolean.TRUE.
     */
    public static final String EMPTY_FIELD_MAP = "EMPTY_FIELD_MAP";
}
