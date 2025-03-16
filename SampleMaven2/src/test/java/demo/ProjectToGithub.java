package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectToGithub {
	public class GitSample {
		@Test
		public void launch() {
			Reporter.log("push from project to github", true);
		}
		}
}
