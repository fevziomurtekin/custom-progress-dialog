# Custom Progress Dialog

Custom progress dialog library written in Kotlin.

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
     <center><img src="https://media.giphy.com/media/5z2jQftmsOkLLtBGXT/giphy.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="https://media.giphy.com/media/1hnVJYlW4LC6ddBhBN/giphy.gif" width="250" height="350" /></center>
    </td>
  </tr>
   <tr>
    <th>Bars</th>
    <th>Cube</th>
    <th>Flickr</th>
  </tr>
  <tr>
    <td>
      <center><img src="https://media.giphy.com/media/5UrVrEs3TfYbfJYZd4/giphy.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="https://media.giphy.com/media/5QQpkzxmnGk48pYS2Z/giphy.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="https://media.giphy.com/media/3eSxWMmwM5Zh1xCBw0/giphy.gif" width="250" height="350" /></center>
    </td>
  </tr>
   <tr>
    <th>Eclipse</th>
    <th>Interwind</th>
    <th>Ripple</th>
  </tr>
  <tr>
    <td>
      <center><img src="https://media.giphy.com/media/uiC1y1NCR3cDNjjzw7/giphy.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="https://media.giphy.com/media/edTCgPXwJo0DI33Zql/giphy.gif" width="250" height="350" /></center>
    </td>
    <td>
     <center><img src="https://media.giphy.com/media/QObPYn0Du3hMhmcOPt/giphy.gif" width="250" height="350" /></center>
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
     <center><img src="https://media.giphy.com/media/YTX7BNpDs0CHm9WiT3/giphy.gif" width="250" height="350" /></center>
    </td>
  </tr>
 <tr>
    <th>Wedges</th>
  </tr>
  <tr>
    <td>
     <center><img src="https://media.giphy.com/media/3Mb1HDPER07qDGciQv/giphy.gif" width="250" height="350" /></center>
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
	  implementation 'com.github.fevziomurtekin:custom-progress-dialog:0.1.0'
	  }
	}
  ```
  <h4>Include in the activity </h4>
  
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
  
  <h4> Include in XML </h4>
  ```Gradle 
   <com.fevziomurtekin.customprogress.Dialog
            android:layout_width="60dp"
            android:layout_height="60dp"
            android:id="@+id/progress"
            customprogress:durationTime="50"
            />
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



