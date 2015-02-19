libGDX Migeran Port
-------------------

This branch contains the libGDX Migeran Port.

To try it out, please follow the following steps:

1. Install Migeran on your Mac by following these instructions: http://blog.migeran.com/2014/11/get-started-with-migeran.html
2. Clone the libgdx repository from GitHub: git clone https://github.com/migeran-addons/libgdx
3. In the libgdx folder execute: ant -f fetch.xml
4. In the libgdx folder execute: mvn install
5. Clone a libgdx-demo, e.g.: git clone https://github.com/migeran-addons/libgdx-addons/libgdx-demo-superjumper
6. In the libgdx demo folder execute: ./gradlew eclipse
7. Import the generated migeran project into Eclipse
8. Right click on the project, and choose Run As ... > Migeran Application on Device or on Simulator
9. You may also select "Debug As... > Migeran Application on Device or on Simulator" to run the app in debug mode.

### More Information

#### About Migeran

Migeran is an open source development environment to create iOS Apps in Java. 
It specifically supports cross-platform iOS and Android development 
to minimize code duplication and development effort.

* Check out our website: http://www.migeran.com
* Read our blog: http://blog.migeran.com
* Follow us on Twitter: http://twitter.com/migeran
* Like us on Facebook: https://www.facebook.com/migeranltd
* Ask for help on [Google Groups](https://groups.google.com/forum/#!forum/migeran) 
or on [StackOverflow](http://stackoverflow.com/questions/ask?tags=migeran)


You may also [contact us directly on our website](http://www.migeran.com/contact.html).

#### Commercial Support

Migeran Ltd leads the development of the Migeran project 
and offers professional support packages, project assistance, 
consulting, and custom application development together with our partners.

If you are interested in our services, contact us 
[over the web](http://www.migeran.com/contact.html) or [in email](mailto:support@migeran.com).
