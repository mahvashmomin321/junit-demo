public class HelloTest{
	@Test
	public void testGreetWithValidInput(){
		assertEquals("Hello World",Hello.greet("Hello World"));
	}
}