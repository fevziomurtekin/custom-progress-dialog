package com.fevziomurtekin.customprogress

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout

class Dialog : RelativeLayout,Visibility{

    /*Default duration time in ProgressDialog.*/
    private var durationTime : Int=100

    /*Default type INFINITY*/
    private var type : Type = Type.INFINITY

    private var imageView: ImageView? = null

    private lateinit var animation : AnimationList

    /*height of phone*/
    private var screenHeight :Int=0

    /*widht of phone*/
    private var screenWidht :Int=0

    private lateinit var relativeLayoutParams : RelativeLayout.LayoutParams

    private lateinit var attrs: AttributeSet

    constructor(context: Context?) : super(context)
                { init(context,null,0,0) }
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
                { init(context,attrs,0,0) }
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
                { init(context,attrs,defStyleAttr,0) }
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(
        context,
        attrs,
        defStyleAttr,
        defStyleRes)
                { init(context,attrs,defStyleAttr,defStyleAttr) }

    @SuppressLint("ResourceType")
    private fun init(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {

        this.attrs = attrs!!
        val typedArray:TypedArray = context!!.obtainStyledAttributes(attrs,R.styleable.customprogress)
        durationTime = typedArray.getInt(R.styleable.customprogress_durationTime,durationTime)

        typedArray.recycle()

        if (screenWidht==0 || screenHeight==0 ) onWindowFocusChanged(true)

        animation = AnimationList(type)

        if(imageView==null) {
            imageView = ImageView(context)
            this      . addView(imageView)
        }

        imageView!!. setBackgroundDrawable(animation.getAnimation(this.context,durationTime))

        this.setBackgroundColor(Color.TRANSPARENT)
        this.layoutParams = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)

        relativeLayoutParams = imageView!!.layoutParams as LayoutParams
        relativeLayoutParams.addRule( CENTER_IN_PARENT, TRUE)
        imageView!!.layoutParams=relativeLayoutParams

        this.visibility= View.GONE

        this.setOnClickListener(OnClickListener {  })

    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        screenHeight=height
        screenWidht=width
    }

    override fun show() {
        init(context,attrs,0,0)
        val animationDrawable : AnimationDrawable = imageView!!.background as AnimationDrawable
        animationDrawable.start()
        this.visibility = View.VISIBLE
    }

    override fun gone() {
        val animationDrawable : AnimationDrawable = imageView!!.background as AnimationDrawable
        animationDrawable.stop()
        this.visibility = View.GONE
    }

    fun settype(type:Type){this.type=type}

    fun setdurationTime(durationTime:Int){this.durationTime=durationTime}

}