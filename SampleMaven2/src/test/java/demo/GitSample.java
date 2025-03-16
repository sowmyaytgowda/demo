package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GitSample {
@Test
public void launch() {
	Reporter.log("Launch", true);
	Reporter.log("pull back to project from github by making changes in github", true);
}
}
