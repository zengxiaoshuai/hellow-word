package com.test.composite;

/**
 *
 * 组合模式
 *
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux",11);
        CatalogComponent windowsCourse = new Course("windowsCourse",22);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java目录",2);

        CatalogComponent webCourse = new Course("web",33);
        CatalogComponent mysqlCourse = new Course("mysql",44);
        CatalogComponent springCourse = new Course("spring",44);
        javaCourseCatalog.add(webCourse);
        javaCourseCatalog.add(mysqlCourse);
        javaCourseCatalog.add(springCourse);


        CatalogComponent mkMainCourseCatalog = new CourseCatalog("mk主目录",1);
        mkMainCourseCatalog.add(linuxCourse);
        mkMainCourseCatalog.add(windowsCourse);
        mkMainCourseCatalog.add(javaCourseCatalog);

        mkMainCourseCatalog.print();

    }

}
