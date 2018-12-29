# Custom Progress Dialog

Custom progress dialog library written for Kotlin.

<h4>Types of Progress Bar</h4>

* INFINITY
* BARS
* ECLIPSE
* BALL
* CUBE
* FLICKR
* INTERWIND
* RIPPLE
* PACMAN
* SPINNER
* TRIANGLE
* WEDGES
* HEART



# Screens
With various dialogs you will make the definition of beautiful transition screens.
<table>
  <tr>
    <th>Infinity</th>
    <th>Heart</th>
    <th>Ball</th>
  </tr>
  <tr>
    <td>
      <center><img src="https://media.giphy.com/media/byzdz3B4YkFiPMFH0G/giphy.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/heart.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/ball.gif" width="250" height="350" /></center>
    </td>
  </tr>
   <tr>
    <th>Bars</th>
    <th>Cube</th>
    <th>Flickr</th>
  </tr>
  <tr>
    <td>
      <center><img src="/art/bars.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/cube.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/flickr.gif" width="250" height="350" /></center>
    </td>
  </tr>
   <tr>
    <th>Eclipse</th>
    <th>Interwind</th>
    <th>Ripple</th>
  </tr>
  <tr>
    <td>
      <center><img src="/art/eclipse.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="https://media.giphy.com/media/fQYu6VsRYHuSOMMAve/giphy.gif width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="/art/ripple.gif" width="250" height="350" /></center>
    </td>
  </tr>
   <tr>
    <th>Pacman</th>
    <th>Spinner</th>
    <th>Triangle</th>
  </tr>
  <tr>
    <td>
      <center><img src="https://media.giphy.com/media/AE7PZ9QPLXbnf5nv4U/giphy.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="https://media.giphy.com/media/4H1pfgyYR8H2vkE49R/giphy.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="https://media.giphy.com/media/fQYu6VsRYHuSOMMAve/giphy.gif" width="250" height="350" /></center>
    </td>
  </tr>
 <tr>
    <th>Wedges</th>
  </tr>
  <tr>
    <td>
     <center><img src="/art/wedges.gif" width="250" height="350" /></center>
    </td>
  </tr>

</table>
</br>

# Usage

```Gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  .....

  dependencies {
	        implementation 'com.github.fevziomurtekin:lockscreen:0.1.1'
	  }
	}
  ```
  </br> Include in the activity 
  ```Gradle 
 class MainActivity : AppCompatActivity() {

    private lateinit var progressbar : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressbar = findViewById(R.id.progress)
        progressbar.settype(Type.WEDGES)
        progressbar.setdurationTime(100)
        progressbar.show()
    }
}
  ```
  
  # Attributes

  | Attribute | Description |
| --- | --- |
| `durationTime` | Default time, 100 |
| `type` | The dialog type (by default INFINITY) |


## License

    	MIT License

    	Copyright (c) 2018 Fevzi Ömür Tekin

	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in all
	copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
	SOFTWARE.



